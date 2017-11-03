package com.example.user.music_shop.Models.TypeOfInstrument.BrassInstruments;

import com.example.user.music_shop.Models.TypeOfInstrument.BrassInstrument;

/**
 * Created by user on 03/11/2017.
 */

public class Trumpet extends BrassInstrument {


    public Trumpet() {
        super(3);
    }

    public String play() {
        return "I'm a Trumpet!";
    }
}
