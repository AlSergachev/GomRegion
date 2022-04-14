package com.apps.gomregion.domain.model;

public class Selsovet {
    private final String link;
    private final String title;
    private final int image;

    public Selsovet(String link, String title, int image) {
        this.link = link;
        this.title = title;
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
