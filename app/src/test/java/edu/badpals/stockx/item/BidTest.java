package edu.badpals.stockx.item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
    
    
public class BidTest {

    @Test
    public void testBidCompareTo() {
        Bid firstBid = new Bid("9.5", 120);
        Bid secondBid = new Bid("9.5", 120);
        //Bid thirdBid = new Bid("9.5", 130);
        int expResult = 0;
        assertEquals(firstBid.compareTo(secondBid), expResult);
    }

    @Test
    public void testBidCompareToLess() {
        Bid firstBid = new Bid("9.5", 120);
        Bid secondBid = new Bid("9.5", 130);
        int expResult = -1;
        assertEquals(firstBid.compareTo(secondBid), expResult);
    }

    @Test
    public void testBidCompareToMore() {
        Bid firstBid = new Bid("9.5", 140);
        Bid secondBid = new Bid("9.5", 130);
        int expResult = 1;
        assertEquals(firstBid.compareTo(secondBid), expResult);
    }
}
    