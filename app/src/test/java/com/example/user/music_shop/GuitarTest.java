package com.example.user.music_shop;

import com.example.user.music_shop.Models.TypeOfInstrument.StringInstruments.Guitar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class GuitarTest {


    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(30, 50, 6);
    }
    @Test
    public void canGetDescription() {
        assertEquals("Guitar", guitar.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void canGetNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, guitar.calculateMarkup());
    }
}
