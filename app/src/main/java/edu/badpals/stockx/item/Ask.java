package edu.badpals.stockx.item;

public class Ask implements Offer {
    private String size = "";
    private Integer ask = 0;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    public String size() {
        return this.size;
    }
    
    public int value() {
        return this.ask.intValue();
    }

    @Override
    public int compareTo(Offer offer) {
        return this.ask.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() +"\n"; 
    }

}
