package com.example.user.music_shop;

import com.example.user.music_shop.Models.Miscellaneous.DrumStick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick(5, 10);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Drum Stick", drumStick.getDescription());
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(5, drumStick.calculateMarkup());
    }
}
