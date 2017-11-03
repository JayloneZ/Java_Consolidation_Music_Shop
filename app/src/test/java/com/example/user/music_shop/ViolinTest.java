package com.example.user.music_shop;

import com.example.user.music_shop.Models.TypeOfInstrument.StringInstruments.Violin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin(30, 50, "Brown", 4);
    }
    @Test
    public void canGetDescription() {
        assertEquals("Violin", violin.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("String", violin.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void canGetNumOfStrings() {
        assertEquals(4, violin.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(20, violin.calculateMarkup());
    }
}
