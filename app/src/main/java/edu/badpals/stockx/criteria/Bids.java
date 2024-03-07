package edu.badpals.stockx.criteria;

import java.util.*;
import java.util.stream.Collectors;

import edu.badpals.stockx.item.Bid;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

public class Bids implements Criteria{

    public Bids(){}

    public List<Offer> checkCriteria(Item item) {

        return item.offers().stream()
                            .filter(Bid.class::isInstance)
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList());
    }
}