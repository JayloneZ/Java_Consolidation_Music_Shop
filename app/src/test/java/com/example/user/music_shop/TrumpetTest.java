package com.example.user.music_shop;

import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstruments.Trumpet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(30, 50);
    }
    @Test
    public void canGetDescription() {
        assertEquals("Trumpet", trumpet.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void canGetNumOfValves() {
        assertEquals(3, trumpet.getNumOfValves());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, trumpet.calculateMarkup());
    }

}
