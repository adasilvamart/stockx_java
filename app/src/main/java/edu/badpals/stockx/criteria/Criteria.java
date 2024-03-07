package edu.badpals.stockx.criteria;

import java.util.List;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Item;

public interface Criteria {
    public List<Offer> checkCriteria(Item item);
}