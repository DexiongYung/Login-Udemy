package com.buzz.udemy.activities;

import android.os.Bundle;

import com.Fragments.LoginFragment;
import com.bignerdranch.android.udemy.R;

/**
 * Created by Dylan on 2017-06-22.
 */

public class LoginNarrowActivity extends BaseActivity implements LoginFragment.Callbacks{
    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        setContentView(R.layout.activity_login_narrow);
    }

    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
