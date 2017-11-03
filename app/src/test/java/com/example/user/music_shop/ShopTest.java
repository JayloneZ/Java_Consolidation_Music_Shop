package com.example.user.music_shop;

import com.example.user.music_shop.Behaviors.Sellable;
import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstruments.Saxophone;
import com.example.user.music_shop.Models.Shop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class ShopTest {
    Saxophone saxophone;
    ArrayList<Sellable> stock;
    Shop shop;

    @Before
    public void before() {
        stock = new ArrayList<>();
        shop = new Shop(stock);
        saxophone = new Saxophone(30, 40, 23);
    }
    @Test
    public void testCanGetArraySize() {
        assertEquals(0, shop.getSize());
    }

    @Test
    public void testCanAddItem() {
        shop.add(saxophone);
        assertEquals(1, shop.getSize());
    }

    @Test
    public void testCanRemoveItem() {
        shop.add(saxophone);
        assertEquals(1, shop.getSize());
        shop.remove(saxophone);
        assertEquals(0, shop.getSize());
    }

}
