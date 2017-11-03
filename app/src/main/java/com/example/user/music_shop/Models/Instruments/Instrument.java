package com.example.user.music_shop.Models.Instruments;

import com.example.user.music_shop.Behaviors.Playable;
import com.example.user.music_shop.Shop;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instrument extends Shop implements Playable {
    private String material;
    private String colour;
    private String type;

    public Instrument(String description, int boughtFor, int sellingFor, String material, String colour, String type) {
        super(description, boughtFor, sellingFor);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

}
