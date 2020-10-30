package com.cnakhn.wishlist;

public class WishesItem {
    private int wishImage;
    private String wishTitle;

    public WishesItem(int wishImage, String wishTitle) {
        this.wishImage = wishImage;
        this.wishTitle = wishTitle;
    }

    public int getWishImage() {
        return wishImage;
    }

    public void setWishImage(int wishImage) {
        this.wishImage = wishImage;
    }

    public String getWishTitle() {
        return wishTitle;
    }

    public void setWishTitle(String wishTitle) {
        this.wishTitle = wishTitle;
    }
}
