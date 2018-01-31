package com.blogspot.droidcrib.patterntutorial.creational.factory;

import android.util.Log;

import static com.blogspot.droidcrib.patterntutorial.MainActivity.TAG;

/**
 * Created  on 31.01.2018.
 */

public class TimeClass extends AbstractDateTimeProvider {
    @Override
    public void getValue() {
        Log.d(TAG, "TimeClass: value of time");
    }
}
