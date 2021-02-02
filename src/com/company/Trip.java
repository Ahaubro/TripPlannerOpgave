package com.company;

public class Trip {

    //Fields
    private String title;
    private int duration;
    private String place;
    private int cost;

    //Constructor
    public Trip(String title, int duration, String place, int cost) {
        this.title = title;
        this.duration = duration;
        this.place = place;
        this.cost = cost;

    }

    //Getters and Setters

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public String getPlace() {
        return place;
    }
    public int getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString() {
        return("Title: " + title + "\nDuration in days: " + duration + "\nPlace: " + place + "\nCost: " + cost);
    }

}
