package edu.badpals.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;
import edu.badpals.stockx.item.Offer;
import edu.badpals.stockx.item.Item;

public class AndCriteria implements Criteria{
    private Criteria criteria = null;
    private Criteria otherCriteria = null;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteria = this.criteria.checkCriteria(item);
        List<Offer> secondCriteria = this.otherCriteria.checkCriteria(item);
        
        return firstCriteria.stream()
                            .filter(secondCriteria::contains)
                            .collect(Collectors.toList());
    }
}
