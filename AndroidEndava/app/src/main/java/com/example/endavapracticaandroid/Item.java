package com.example.endavapracticaandroid;

public class Item {
    String eventType;
    String location;
    String description;
    int image;

    public Item(String eventType, String location, String description, int image) {
        this.eventType = eventType;
        this.location = location;
        this.description = description;
        this.image = image;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
