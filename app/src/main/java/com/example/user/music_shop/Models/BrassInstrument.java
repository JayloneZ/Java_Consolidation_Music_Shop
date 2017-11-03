package com.example.user.music_shop.Models;

/**
 * Created by user on 03/11/2017.
 */

public abstract class BrassInstrument {
    private String material;
    private String colour;
    protected int numOfValves;

    public BrassInstrument(int numOfValves) {
        this.material = "Brass";
        this.colour = "Gold";
        this.numOfValves = numOfValves;
    }
}
