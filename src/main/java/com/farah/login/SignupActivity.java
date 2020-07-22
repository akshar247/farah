package com.farah.login;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.farah.R;
import com.farah.activity.DashboardActivity;
import com.farah.config.CommonFunctions;
import com.farah.config.Constants;
import com.farah.config.FarahConfig;
import com.farah.model.LoginResponse;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignupActivity extends AppCompatActivity {

    @BindView(R.id.iv_header)
    ImageView ivHeader;
    @BindView(R.id.et_firstname)
    EditText etFirstname;
    @BindView(R.id.et_lastname)
    EditText etLastname;
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_mobile)
    EditText etMobile;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.et_confirm_password)
    EditText etConfirmPassword;
    @BindView(R.id.ck_term_condition)
    AppCompatCheckBox ckTermCondition;
    @BindView(R.id.btn_signup)
    Button btnSignup;
    @BindView(R.id.tv_login)
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        init();
    }

    private void init() {
        try {
            ButterKnife.bind(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick({R.id.btn_signup, R.id.tv_login})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_signup:
                signup();
                break;
            case R.id.tv_login:
                CommonFunctions.changeactivity(this,LoginActivity.class);
                break;
        }
    }

    private void signup() {
        try {
            String emailvalid = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
            /*if (checkImage == 0)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_camera));
            else*/ if (etFirstname.getText().toString().length() == 0)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_fname));
            else if (etLastname.getText().toString().length() == 0)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_lname));
            else if (etEmail.getText().toString().length() == 0)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_email));
            else if (etMobile.getText().toString().length() == 0 || etMobile.getText().toString().length() < 8)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_mobil));
            else if (etPassword.getText().toString().length() == 0)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_pwd));
            else if (etPassword.getText().toString().length() < 6)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_pwd1));
            else if (etConfirmPassword.getText().toString().length() == 0)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_conf_pwd));
            else if (etConfirmPassword.getText().toString().length() < 6)
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_conf_pwd1));
            else if (etEmail.getText().toString().length() > 0 && !etEmail.getText().toString().trim().matches(emailvalid))
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_valid_email));
            else if (!(etPassword.getText().toString()).equals(etConfirmPassword.getText().toString()))
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_mismatch));
            else if(!ckTermCondition.isChecked())
            {
                showAlertDialog(getString(R.string.app_name), getString(R.string.err_accept_term));
            }
            else
            {
               registeruser();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registeruser() {
        try {
            if (CommonFunctions.checkConnection(this)) {
                String url = FarahConfig.WEBURL + FarahConfig.signup;
                Map<String, String> mParams = new HashMap<>();
                mParams.put(Constants.firstname, etFirstname.getText().toString().trim());
                mParams.put(Constants.lastname, etLastname.getText().toString().trim());
                mParams.put(Constants.mobile_no, etMobile.getText().toString().trim());
                mParams.put(Constants.email, etEmail.getText().toString().trim());
                mParams.put(Constants.password, etPassword.getText().toString().trim());

                Log.e("url", url);
                Log.e("mParams", mParams.toString());

                CommonFunctions.createProgressBar(this, getString(R.string.msg_please_wait));
                AndroidNetworking.post(url)
                        .addBodyParameter(mParams)
                        .setTag(url)
                        .setPriority(Priority.HIGH)
                        .build()
                        .getAsJSONObject(new JSONObjectRequestListener() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    CommonFunctions.destroyProgressBar();
                                    Log.e("res", response.toString());
                                    Gson gson = new Gson();
                                    LoginResponse loginResponse = gson.fromJson(response.toString(), LoginResponse.class);
                                    if (loginResponse.success == 200) {
                                        CommonFunctions.setPreference(SignupActivity.this, Constants.isLogin, true);
                                        CommonFunctions.setPreference(getApplicationContext(), Constants.userdata, gson.toJson(loginResponse));
                                        CommonFunctions.changeactivity(SignupActivity.this, DashboardActivity.class);
                                        finishAffinity();
                                    } else {
                                        Toast.makeText(SignupActivity.this, loginResponse.message, Toast.LENGTH_SHORT).show();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onError(ANError error) {
                                try {
                                    CommonFunctions.destroyProgressBar();
                                    Toast.makeText(SignupActivity.this, R.string.msg_server_error, Toast.LENGTH_SHORT).show();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void showAlertDialog(String title, String msg) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        if (title != null)
            dialogBuilder.setTitle(title);
        dialogBuilder.setIcon(R.mipmap.ic_launcher1);
        dialogBuilder.setMessage(msg);
        dialogBuilder.setPositiveButton(getString(R.string.dialog_ok), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialogBuilder.setCancelable(false);
        dialogBuilder.show();
    }
}