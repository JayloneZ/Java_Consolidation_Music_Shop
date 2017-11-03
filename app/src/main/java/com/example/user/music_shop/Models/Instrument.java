package com.example.user.music_shop.Models;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instrument {
    private String material;
    private String colour;
    private String type;

    public Instrument(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
