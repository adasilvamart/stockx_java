package edu.badpals.stockx.criteria;
import org.junit.Test;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
    
    
public class BidsTest {

    @Test
    public void testBidsCheckCriteria() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("6", 200));

        Bids bidsFilter = new Bids();
        int expResult = 2;
        assertEquals(bidsFilter.checkCriteria(sneaker).stream().count(), expResult);
    }
}
    