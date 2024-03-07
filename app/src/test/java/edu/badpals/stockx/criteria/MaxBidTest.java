package edu.badpals.stockx.criteria;

import org.junit.Test;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class MaxBidTest {
    private Sneaker sneaker;

    @Before
    public void setUp() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));
    }

    @Test
    public void testMaxBidValue() {

        Criteria maxBid = new MaxBid();

        int max = maxBid.checkCriteria(sneaker).get(0).value();
        int expResult = 550;

        assertEquals(expResult, max);

    }
}
