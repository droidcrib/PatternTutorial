package com.blogspot.droidcrib.patterntutorial.creational.factoryabstract;

import android.util.Log;

import static com.blogspot.droidcrib.patterntutorial.MainActivity.TAG;

/**
 * Created by BulanovA on 31.01.2018.
 */

public class ElfMag implements Mag {
    @Override
    public void cast() {
        Log.d(TAG, "ElfMag: casting!");
    }
}
