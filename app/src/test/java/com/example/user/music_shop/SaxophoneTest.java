package com.example.user.music_shop;

import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstruments.Saxophone;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class SaxophoneTest {
    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(30, 50, 23);
    }
    @Test
    public void canGetDescription() {
        assertEquals("Saxophone", saxophone.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Brass", saxophone.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void canGetNumOfValves() {
        assertEquals(23, saxophone.getNumOfValves());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, saxophone.calculateMarkup());
    }
}
