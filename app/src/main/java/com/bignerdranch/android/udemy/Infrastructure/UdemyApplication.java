package com.bignerdranch.android.udemy.Infrastructure;

import android.app.Application;

/**
 * Created by Dylan on 2017-06-20.
 */

public class UdemyApplication extends Application {
    private Authentication auth;

    @Override
    public void onCreate(){
        super.onCreate(); //Always need this
        auth = new Authentication(this);
    }

    public Authentication getAuthentication(){

        return auth;
    }
}
