package com.example.multiviewrecyclerview.model;

import android.graphics.drawable.Drawable;

public class Image {
    private Drawable imageRes;
    private String userName;

    public Drawable getImageRes() {
        return imageRes;
    }

    public void setImageRes(Drawable imageRes) {
        this.imageRes = imageRes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
