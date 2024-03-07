package main.java.edu.badpals.stockx.item;

import edu.badpals.stockx.item.Offer;

public class Sale implements Offer {
    private String size = "";
    private Integer price = 0;
    
    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    public String size() {
        return this.size;
    }
    
    public int value() {
        return this.price.intValue();
    }

    @Override
    public int compareTo(Offer offer) {
        return this.price.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n"; 
    }
}
