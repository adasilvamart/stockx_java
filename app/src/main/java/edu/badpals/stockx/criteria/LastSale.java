package main.java.edu.badpals.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Offer;

public class LastSale implements Criteria {
    public LastSale() {
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Sales salesFilter = new Sales();
        return salesFilter.checkCriteria(item).getLast();
    }
}
