package com.blogspot.droidcrib.patterntutorial.creational.singleton;

/**
 * Singleton
 *
 * Acceptable for multi-threading applications
 */

public class RobotMultithread {

    private static RobotMultithread robot;

    private RobotMultithread() {
    }

    public static synchronized RobotMultithread getRobot(){

        if(robot == null){
            robot = new RobotMultithread();
        }
        return robot;
    }
}
