package com.example.user.music_shop.Models.Instruments.TypeOfInstrument;

import com.example.user.music_shop.Models.Instruments.Instrument;

/**
 * Created by user on 03/11/2017.
 */

public abstract class BrassInstrument extends Instrument {

    protected int numOfValves;

    public BrassInstrument(String description, int boughtFor, int sellingFor, int numOfValves) {
        super(description, boughtFor, sellingFor, "Brass", "Gold", "Brass");

        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }
}
