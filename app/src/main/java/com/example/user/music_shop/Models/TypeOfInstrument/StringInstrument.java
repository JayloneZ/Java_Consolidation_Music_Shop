package com.example.user.music_shop.Models.TypeOfInstrument;

import com.example.user.music_shop.Models.Instrument;

/**
 * Created by user on 03/11/2017.
 */

public abstract class StringInstrument extends Instrument{
    protected int numOfStrings;


    public StringInstrument(String description, int boughtFor, int sellingFor, String material, String colour, int numOfStrings) {
        super(description, boughtFor, sellingFor, material ,colour, "String");

        this.numOfStrings = numOfStrings;
    }

}
