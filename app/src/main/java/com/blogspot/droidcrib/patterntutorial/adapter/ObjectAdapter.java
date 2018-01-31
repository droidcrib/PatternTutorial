package com.blogspot.droidcrib.patterntutorial.adapter;

/**
 * Created by BulanovA on 31.01.2018.
 */

public class ObjectAdapter implements EventInterface {
    Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void onEvent() {
        adaptee.react();
    }
}
