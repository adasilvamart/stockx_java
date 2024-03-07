package edu.badpals.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

public class MaxBid implements Criteria {

    public MaxBid(){}

    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> maxBid = item.offers().stream()
                            .filter(Bid.class::isInstance)
                            .max(Comparator.naturalOrder());
        
        if (maxBid.isPresent()) {
            return List.of(maxBid.get());
        }

        return List.of();
    }
}
