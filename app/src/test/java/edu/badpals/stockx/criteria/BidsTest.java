package edu.badpals.stockx.criteria;
import org.junit.Test;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Sneaker;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testBidsCheckCriteriaReturnList() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("13", 550));
        Offer[] result = {new Bid("13", 550), new Bid("13", 550)};

        List<Offer> expResult = Arrays.asList(result);
        Bids bidsFilter = new Bids();
        assertEquals(bidsFilter.checkCriteria(sneaker), expResult);
    }
}
    