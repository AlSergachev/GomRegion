package com.apps.gomregion.domain.model;

public class JustLink {
    private final int title;
    private final int description;
    private int imgTitle = 0;
    private int icon = 0;
    private final boolean isTitle;
    private final String link;

    public JustLink(int title, int description, String link, int img, boolean isTitle) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.isTitle = isTitle;
        if (isTitle) {
            this.imgTitle = img;
        } else {
            this.icon = img;
        }
    }

    public int getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public int getTitle() {
        return title;
    }

    public int getImgTitle() {
        return imgTitle;
    }

    public int getIcon() {
        return icon;
    }

    public boolean isTitle() {
        return isTitle;
    }
}
