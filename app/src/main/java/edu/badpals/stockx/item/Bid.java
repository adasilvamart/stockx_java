package edu.badpals.stockx.item;

public class Bid implements Offer {
    private String size = "";
    private Integer bid = 0;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return this.size;
    }
    
    public int value() {
        return this.bid.intValue();
    }

    public int compareTo(Offer offer) {
        return this.bid.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n"; 
    }

}
