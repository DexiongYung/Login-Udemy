package com.buzz.udemy.activities;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Dylan on 2017-06-20.
 */

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    protected final void onCreate(Bundle savedState){
        super.onCreate(savedState);

        if(!application.getAuthentication().getUser().isLoggedIn()){
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onUdemyCreate(savedState);
    }

    protected abstract void onUdemyCreate(Bundle savedState);
}
