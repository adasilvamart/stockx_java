package edu.badpals.stockx.criteria;

import java.util.*;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

public class Min implements Criteria{

    private Criteria criteria = null;
    private Criteria otherCriteria = null;
    
    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        
        AndCriteria filter = new AndCriteria(this.criteria, this.otherCriteria);
        Optional<Offer> oferta = filter.checkCriteria(item).stream().min(Comparator.naturalOrder());

        if (oferta.isPresent()) {
            return List.of(oferta.get());
        }

        return List.of();
    }
}