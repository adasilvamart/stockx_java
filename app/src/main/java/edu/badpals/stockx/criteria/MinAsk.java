package edu.badpals.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

public class MinAsk implements Criteria {

    public MinAsk() {
    }

    public List<Offer> checkCriteria(Item item) {

        Asks asksFilter = new Asks();
        Optional<Offer> minAsk = asksFilter.checkCriteria(item)
                .stream()
                .min(Comparator.naturalOrder());

        if (minAsk.isPresent()) {
            return List.of(minAsk.get());
        }

        return List.of();

    }
}
