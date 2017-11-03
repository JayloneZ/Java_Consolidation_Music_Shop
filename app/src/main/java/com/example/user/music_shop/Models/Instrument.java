package com.example.user.music_shop.Models;

import com.example.user.music_shop.Behaviors.Playable;
import com.example.user.music_shop.Behaviors.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    private String description;
    private int boughtFor;
    private int sellingFor;
    private String material;
    private String colour;
    private String type;

    public Instrument(String description, int boughtFor, int sellingFor, String material, String colour, String type) {
        this.boughtFor = boughtFor;
        this.sellingFor = sellingFor;
        this.description = description;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
