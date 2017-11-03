package com.example.user.music_shop.Models.TypeOfInstrument.StringInstruments;

import com.example.user.music_shop.Models.TypeOfInstrument.StringInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Harp extends StringInstrument {

    public Harp(String colour, int numOfStrings) {
        super("Wood", colour, numOfStrings);
    }

    public String play() {
        return "I'm a Harp!";
    }
}
