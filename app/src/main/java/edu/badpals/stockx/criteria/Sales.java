package edu.badpals.stockx.criteria;

import java.util.stream.Collectors;
import java.util.List;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Sale;
import edu.badpals.stockx.item.Offer;


public class Sales implements Criteria {
    
    public Sales(){
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                            .filter(Sale.class::isInstance)
                            .collect(Collectors.toList());
    }
}
