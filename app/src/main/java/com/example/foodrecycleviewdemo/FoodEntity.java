package com.example.foodrecycleviewdemo;

public class FoodEntity {

    private int imageUrl;
    private int imageHeader;
    private String name;

    public FoodEntity(int imageUrl, int imageHeader, String name) {
        this.imageUrl = imageUrl;
        this.imageHeader = imageHeader;
        this.name = name;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getImageHeader() {
        return imageHeader;
    }

    public void setImageHeader(int imageHeader) {
        this.imageHeader = imageHeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
