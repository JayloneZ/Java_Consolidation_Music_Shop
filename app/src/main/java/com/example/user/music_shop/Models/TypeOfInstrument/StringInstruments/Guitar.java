package com.example.user.music_shop.Models.TypeOfInstrument.StringInstruments;

import com.example.user.music_shop.Models.TypeOfInstrument.StringInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Guitar extends StringInstrument {


    public Guitar(int boughtFor, int sellingFor, int numOfStrings) {
        super("Guitar", boughtFor, sellingFor,"Wood", "Brown", numOfStrings);
    }

    public String play() {
        return "I'm a Guitar!";
    }
}