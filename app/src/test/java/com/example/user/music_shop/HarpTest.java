package com.example.user.music_shop;

import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.StringInstruments.Harp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class HarpTest {

    Harp harp;

    @Before
    public void before() {
        harp = new Harp(30, 50, "Silver", 50);
    }
    @Test
    public void canGetDescription() {
        assertEquals("Harp", harp.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", harp.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("String", harp.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Silver", harp.getColour());
    }

    @Test
    public void canGetNumOfStrings() {
        assertEquals(50, harp.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, harp.calculateMarkup());
    }
}
