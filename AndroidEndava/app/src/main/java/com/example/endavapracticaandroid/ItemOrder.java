package com.example.endavapracticaandroid;

import java.util.Date;

public class ItemOrder {
   private String typeTicket;
   private String numberOfTickets;
   private String eventName;
   private String price;
   private String orderedAt;

   private int image;

    public ItemOrder(String typeTicket, String numberOfTickets, String eventName, String price, String orderedAt, int image) {
        this.typeTicket = typeTicket;
        this.numberOfTickets = numberOfTickets;
        this.eventName = eventName;
        this.price = price;
        this.orderedAt = orderedAt;
        this.image = image;
    }

    public String getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(String typeTicket) {
        this.typeTicket = typeTicket;
    }

    public String getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(String numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(String orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
