package com.example.user.music_shop.Models;

import com.example.user.music_shop.Behaviors.Sellable;
import com.example.user.music_shop.Models.Instruments.TypeOfInstrument.BrassInstruments.Saxophone;
import com.example.user.music_shop.ShopObjects;

import java.util.ArrayList;

/**
 * Created by user on 03/11/2017.
 */

public class Shop {
    private ArrayList<Sellable> shopObjects;

    public Shop(ArrayList<Sellable> shopObjects) {
        this.shopObjects = shopObjects;
    }

    public void add(Sellable object) {
        this.shopObjects.add(object);
    }

    public void remove(Sellable object) {
        this.shopObjects.remove(object);
    }

    public int getSize() {
        return this.shopObjects.size();
    }

}
