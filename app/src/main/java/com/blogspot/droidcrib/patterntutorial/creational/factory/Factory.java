package com.blogspot.droidcrib.patterntutorial.creational.factory;

import java.sql.Time;
import java.util.Date;

/**
 * Created by BulanovA on 31.01.2018.
 */

public class Factory {

    public AbstractDateTimeProvider getProvider(Object o) {
        AbstractDateTimeProvider writer = null;

        if (o instanceof Time) {
            writer = new TimeClass();
        } else if (o instanceof Date){
            writer = new DateClass();
        }
        return writer;
    }
}
