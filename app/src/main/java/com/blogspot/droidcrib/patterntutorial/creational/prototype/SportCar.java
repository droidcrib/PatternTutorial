package com.blogspot.droidcrib.patterntutorial.creational.prototype;

/**
 * Created  on 31.01.2018.
 */

public class SportCar implements Copyable {

    private String color = "Yellow";
    private String engine = "V6";
    private String speed = "250 kmh";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public Copyable copy() {
        return new SportCar();
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
