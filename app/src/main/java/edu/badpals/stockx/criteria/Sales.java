package main.java.edu.badpals.stockx.criteria;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import edu.badpals.stockx.item.Item;
import main.java.edu.badpals.stockx.item.Sale;

public class Sales implements Criteria {
    
    public Sales(){
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                            .filter(Sale.class::isInstance)
                            .collect(Collectors.toList());
    }
}
