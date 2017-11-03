package com.example.user.music_shop.Models.TypeOfInstrument.StringInstruments;

import com.example.user.music_shop.Models.TypeOfInstrument.StringInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Violin extends StringInstrument {

    public Violin(int boughtFor, int sellingFor, String colour, int numOfStrings) {
        super("Violin", boughtFor, sellingFor, "Wood", colour, numOfStrings);
    }

    public String play() {
        return "I'm a Violin!";
    }
}