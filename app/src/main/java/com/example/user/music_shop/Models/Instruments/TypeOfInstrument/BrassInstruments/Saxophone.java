package com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstruments;

import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Saxophone extends BrassInstrument {


    public Saxophone(int boughtFor, int sellingFor, int numOfValves) {
        super("Saxophone", boughtFor, sellingFor, numOfValves);
    }

    public String play() {
        return "I'm a Saxophone!";
    }

}
