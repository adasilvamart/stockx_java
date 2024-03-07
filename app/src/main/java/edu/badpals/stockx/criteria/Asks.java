package edu.badpals.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.badpals.stockx.item.*;

public class Asks implements Criteria {
    
    public Asks() {} 

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                            .filter(Ask.class::isInstance)
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList());
    }
}
