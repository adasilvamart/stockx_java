package edu.badpals.stockx.criteria;

import edu.badpals.stockx.item.Item;

import java.util.List;
import java.util.Objects;
import edu.badpals.stockx.item.Offer;

public class Size implements Criteria {

    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria (Item item) {
        return item.offers().stream()
                            .filter(o -> Objects.equals(o.size(), this.size))
                            .toList();
    }
}
