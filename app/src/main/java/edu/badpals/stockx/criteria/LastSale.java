package edu.badpals.stockx.criteria;

import java.util.List;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;


public class LastSale implements Criteria {
    public LastSale() {
    }

    public List<Offer> checkCriteria(Item item) {
        Sales salesFilter = new Sales();
        return salesFilter.checkCriteria(item);
    }
}
