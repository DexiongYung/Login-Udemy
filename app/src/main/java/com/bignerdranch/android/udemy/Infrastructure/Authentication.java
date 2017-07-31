package com.bignerdranch.android.udemy.Infrastructure;

import android.content.Context;

/**
 * Created by Dylan on 2017-06-20.
 */

public class Authentication {
    private final Context context;
    private User user;

    public Authentication(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {

        return user;
    }
}
