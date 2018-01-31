package com.blogspot.droidcrib.patterntutorial.creational.singleton;

/**
 * Singleton
 *
 * Not acceptable for multi-threading applications
 */

public class Robot {

    private static Robot robot;

    private Robot() {
    }

    public Robot getRobot() {
        if (robot == null) {
            robot = new Robot();
        }
        return robot;
    }
}
