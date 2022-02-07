package com.example.gomregion.presentation;

public class Selsovet {
    String link;
    String title;
    int image;

    public Selsovet(String link, String title, int image) {
        this.link = link;
        this.title = title;
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
