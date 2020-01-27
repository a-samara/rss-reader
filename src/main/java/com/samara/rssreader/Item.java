package com.samara.rssreader;

import android.graphics.drawable.Drawable;

public class Item {

    String title, date, description, url;
    Drawable image;

    public Item(String title, String date, String description, String url, Drawable image) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.url = url;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public Drawable getImage() {
        return image;
    }

}
