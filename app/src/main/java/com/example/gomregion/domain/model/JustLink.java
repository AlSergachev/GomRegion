package com.example.gomregion.domain.model;

public class JustLink {
    private int title;
    private int description;
    private String link;

    public JustLink(int title, int description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }
}
