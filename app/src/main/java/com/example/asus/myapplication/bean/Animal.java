package com.example.asus.myapplication.bean;

public class Animal {
   private int image;
   private String title;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Animal(int image, String title) {
        this.image = image;
        this.title = title;
    }
}
