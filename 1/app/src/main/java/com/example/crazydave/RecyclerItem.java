package com.example.crazydave;
public class RecyclerItem {
    private String title;
    private int imageId;

    public RecyclerItem(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return imageId;
    }
}