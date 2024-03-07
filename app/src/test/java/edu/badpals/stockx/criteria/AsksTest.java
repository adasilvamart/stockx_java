package edu.badpals.stockx.criteria;
import org.junit.Test;

import edu.badpals.stockx.item.Ask;
import edu.badpals.stockx.criteria.Asks;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
    
    
public class AsksTest {

    @Test
    public void testBidsCheckCriteria() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Ask("13", 550));
        sneaker.add(new Ask("6", 200));

        Asks asksFilter = new Asks();
        int expResult = 2;
        assertEquals(asksFilter.checkCriteria(sneaker).stream().count(), expResult);
    }

}
    