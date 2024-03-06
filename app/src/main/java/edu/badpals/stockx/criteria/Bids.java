package main.java.edu.badpals.stockx.criteria;

import java.util.*;
import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

public class Bids implements Criteria{

    public Bids(){}

    public List<Offer> checkCriteria(Item item) {

        List<Offer> bidsFilter = new ArrayList<>();
        
        for (Offer offer : item.offers()) {
            if (offer instanceof Bid) {
                bidsFilter.add(offer);
            }
        }
        return bidsFilter;
    }
}
