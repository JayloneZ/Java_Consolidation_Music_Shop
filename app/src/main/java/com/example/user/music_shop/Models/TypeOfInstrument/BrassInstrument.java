package com.example.user.music_shop.Models.TypeOfInstrument;

import com.example.user.music_shop.Models.Instrument;

/**
 * Created by user on 03/11/2017.
 */

public abstract class BrassInstrument extends Instrument {

    protected int numOfValves;

    public BrassInstrument(int numOfValves) {
        super("Brass", "Gold", "Brass");

        this.numOfValves = numOfValves;
    }
}
