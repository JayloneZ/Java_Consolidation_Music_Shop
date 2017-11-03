package com.example.user.music_shop;

import com.example.user.music_shop.Models.Miscellaneous.GuitarString;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString(5, 10);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Guitar String", guitarString.getDescription());
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(5, guitarString.calculateMarkup());
    }
}
