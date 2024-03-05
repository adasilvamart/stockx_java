package edu.badpals.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    public String style = "";
    public String name = "";
    public int sale = 0;
    public int ask = 0;
    public int bid = 0;
    public List<Offer> offerList = new ArrayList<>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public Object getStyle() {
        return this.style;
    }
    
    public Object getName() {
        return this.name;
    }

    public int getSale() {
        return this.sale;
    }

    public void setSale(int price) {
        this.sale = price;
    }

    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return this.ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void add(Offer offer) {
        offerList.add(offer);
    }

    public List<Offer> offers(){
        return this.offerList;
    }

    @Override
    public String toString() {
        return this.name + "\n \t \t" + this.style;
    }
}
