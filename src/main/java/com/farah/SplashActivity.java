package com.farah;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.farah.activity.DashboardActivity;
import com.farah.config.CommonFunctions;
import com.farah.config.Constants;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        int SPLASH_TIME_OUT = 1500;

        if(CommonFunctions.getPreference(this, Constants.languageid,"").equalsIgnoreCase(""))
            CommonFunctions.setPreference(this,Constants.languageid,"1");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!CommonFunctions.getPreference(SplashActivity.this, Constants.isLogin, false)) {
                    Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
                    intent.putExtra(Constants.from, getString(R.string.tit_home));
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
                    intent.putExtra(Constants.from, getString(R.string.tit_home));
                    startActivity(intent);
                    finish();
                }
            }
        }, SPLASH_TIME_OUT);
    }
}
