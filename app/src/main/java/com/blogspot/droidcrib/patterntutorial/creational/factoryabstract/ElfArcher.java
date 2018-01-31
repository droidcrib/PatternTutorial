package com.blogspot.droidcrib.patterntutorial.creational.factoryabstract;

import android.util.Log;

import static com.blogspot.droidcrib.patterntutorial.MainActivity.TAG;

/**
 * Created by BulanovA on 31.01.2018.
 */

public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        Log.d(TAG, "ElfArcher: shooting!");
    }
}
