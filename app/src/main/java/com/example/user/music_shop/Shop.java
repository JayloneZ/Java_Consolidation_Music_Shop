package com.example.user.music_shop;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Shop {
    private String description;
    private int boughtFor;
    private int sellingFor;

    public Shop(String description, int boughtFor, int sellingFor) {
        this.description = description;
        this.boughtFor = boughtFor;
        this.sellingFor = sellingFor;
    }

    public String getDescription() {
        return this.description;
    }

    public int calculateMarkup() {
        return this.sellingFor - this.boughtFor;
    }
}
