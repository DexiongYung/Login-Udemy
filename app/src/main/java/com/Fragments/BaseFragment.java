package com.Fragments;

import android.app.Fragment;
import android.os.Bundle;

import com.bignerdranch.android.udemy.Infrastructure.UdemyApplication;

/**
 * Created by Dylan on 2017-06-22.
 */

public abstract class BaseFragment extends Fragment{
    protected UdemyApplication application;

    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);

        application = (UdemyApplication) getActivity().getApplication();
    }
}
