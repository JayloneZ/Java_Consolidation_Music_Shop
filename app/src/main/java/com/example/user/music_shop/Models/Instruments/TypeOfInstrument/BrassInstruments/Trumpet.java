package com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstruments;

import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Trumpet extends BrassInstrument {


    public Trumpet(int boughtFor, int sellingFor) {
        super("Trumpet", boughtFor, sellingFor,3);
    }

    public String play() {
        return "I'm a Trumpet!";
    }

}
