package com.example.user.music_shop.Models.Instruments.TypeOfInstrument.StringInstruments;

import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.StringInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Harp extends StringInstrument {

    public Harp(int boughtFor, int sellingFor, String colour, int numOfStrings) {
        super("Harp", boughtFor, sellingFor, "Wood", colour, numOfStrings);
    }

    public String play() {
        return "I'm a Harp!";
    }

}
