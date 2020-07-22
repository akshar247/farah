package com.farah.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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


public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.iv_header)
    ImageView ivHeader;
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.ck_remember)
    AppCompatCheckBox ckRemember;
    @BindView(R.id.tv_forgotpassword)
    TextView tvForgotpassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_signup)
    TextView tvSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }


    private void init() {
        try {
            ButterKnife.bind(this);


        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    public void loginClick() {
        try {
            String emailvalid = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
            if (etEmail.getText().toString().trim().length() == 0) {

                Toast.makeText(this, getString(R.string.err_email_mobil), Toast.LENGTH_SHORT).show();
            } else if (etPassword.getText().toString().trim().length() == 0) {

                Toast.makeText(this, getString(R.string.err_pwd), Toast.LENGTH_SHORT).show();
            } else {
                loginUser(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loginUser(boolean b) {
        try {
            if (CommonFunctions.checkConnection(this)) {
                String url = FarahConfig.WEBURL + FarahConfig.loginURL;
                Map<String, String> mParams = new HashMap<>();
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
                                        CommonFunctions.setPreference(LoginActivity.this, Constants.isLogin, true);
                                        CommonFunctions.setPreference(getApplicationContext(), Constants.userdata, gson.toJson(loginResponse));
                                        CommonFunctions.changeactivity(LoginActivity.this, DashboardActivity.class);
                                    } else {
                                        Toast.makeText(LoginActivity.this, loginResponse.message, Toast.LENGTH_SHORT).show();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            @Override
                            public void onError(ANError error) {
                                try {
                                    CommonFunctions.destroyProgressBar();
                                    Toast.makeText(LoginActivity.this, R.string.msg_server_error, Toast.LENGTH_SHORT).show();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });

            }
        } catch (Exception e) {
            e.printStackTrace();
            CommonFunctions.destroyProgressBar();
        }
    }


    @OnClick(R.id.btn_login)
    public void login() {
        try {
            loginClick();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.tv_forgotpassword)
    public void forgotpassword() {
        try {
            Intent forgotpass = new Intent(this, ForgotPasswordActivity.class);
            startActivity(forgotpass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.tv_signup)
    public void signup() {
        try {
            CommonFunctions.changeactivity(LoginActivity.this, SignupActivity.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}