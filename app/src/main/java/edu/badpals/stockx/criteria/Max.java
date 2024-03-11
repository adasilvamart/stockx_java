package edu.badpals.stockx.criteria;

import java.util.*;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;
import java.util.Optional;

public class Max implements Criteria{

    private Criteria criteria = null;
    private Criteria otherCriteria = null;
    
    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        
        AndCriteria filter = new AndCriteria(this.criteria, this.otherCriteria);
        Optional<Offer> oferta = filter.checkCriteria(item).stream().max(Comparator.naturalOrder());

        if (oferta.isPresent()) {
            return List.of(oferta.get());
        }

        return List.of();
    }
}
