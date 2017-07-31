package com.buzz.udemy.activities;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.bignerdranch.android.udemy.R;

/**
 * Created by Dylan on 2017-07-19.
 */

public class ExternalLoginActivity extends BaseActivity implements View.OnClickListener {
    public static final String EXTRA_EXTERNAL_SERVCE = "EXTRA_EXTERNAL_SERVICE";

    private Button testButton;
    private WebView webView;

    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);

        setContentView(R.layout.activity_external_login);

        testButton = (Button) findViewById(R.id.activity_external_login_testButton);
        webView = (WebView) findViewById(R.id.activity_external_login_webView);

        testButton.setOnClickListener(this);
        testButton.setText("Log in with: " + getIntent().getStringExtra(EXTRA_EXTERNAL_SERVCE));
    }

    @Override
    public void onClick(View view){
        if(view == testButton) {
            application.getAuthentication().getUser().setLoggedIn(true);
            setResult(RESULT_OK);
            finish();
        }
    }

}
