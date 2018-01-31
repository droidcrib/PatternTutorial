package com.blogspot.droidcrib.patterntutorial.strategy;

import android.util.Log;

import static com.blogspot.droidcrib.patterntutorial.MainActivity.TAG;

/**
 * Created by BulanovA on 31.01.2018.
 */

public class Encryption {

    private Algorythm algorythm;

    public Encryption(Algorythm algorythm) {
        this.algorythm = algorythm;
    }

    public void setAlgorythm(Algorythm algorythm) {
        this.algorythm = algorythm;
    }

    public String crypt(String text, String key) {
        Log.d(TAG, "Encryption crypt: encrypting with " + algorythm.getClass());
        return algorythm.crypt(text, key);
    }
}
