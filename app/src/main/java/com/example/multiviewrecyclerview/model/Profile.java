package com.example.multiviewrecyclerview.model;

import android.graphics.drawable.Drawable;

public class Profile {

    private String name;
    private String about;
    private Drawable profileRes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Drawable getProfileRes() {
        return profileRes;
    }

    public void setProfileRes(Drawable profileRes) {
        this.profileRes = profileRes;
    }
}
