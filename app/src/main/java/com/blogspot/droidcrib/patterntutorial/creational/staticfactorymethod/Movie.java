package com.blogspot.droidcrib.patterntutorial.creational.staticfactorymethod;

/**
 * Created  on 31.01.2018.
 */

public class Movie {

    private String title;

    private Movie(String title) {
        this.title = title;
    }

    public static Movie create(String title){
        return new Movie(title);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }
}
