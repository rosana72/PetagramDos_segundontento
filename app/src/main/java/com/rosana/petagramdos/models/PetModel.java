package com.rosana.petagramdos.models;

public class PetModel {
    private int image;
    private String name;
    private int rating;
    private boolean favorite;

    public PetModel(int image, String name, int rating) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.favorite = false;
    }

    public PetModel(int image, String name, int rating, boolean favorite) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.favorite = favorite;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

}

