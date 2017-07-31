package com.buzz.udemy.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;

import com.bignerdranch.android.udemy.Infrastructure.UdemyApplication;

/**
 * Created by Dylan on 2017-06-20.
 */

public abstract class BaseActivity extends AppCompatActivity{
    protected UdemyApplication application;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        application = (UdemyApplication) getApplication();
    }
}
