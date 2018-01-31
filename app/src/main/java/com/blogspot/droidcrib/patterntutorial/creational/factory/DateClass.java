package com.blogspot.droidcrib.patterntutorial.creational.factory;

import android.util.Log;

import static com.blogspot.droidcrib.patterntutorial.MainActivity.TAG;

/**
 * Created by BulanovA on 31.01.2018.
 */

public class DateClass extends AbstractDateTimeProvider {
    @Override
    public void getValue() {
        Log.d(TAG, "DateClass: value of date");
    }
}
