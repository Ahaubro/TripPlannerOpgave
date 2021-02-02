package com.company;

public class Main {

    public static void main(String[] args) {

        SkiTrip s1 = new SkiTrip("Tur til Alperne", 3, "Østrig", 5500);
        BeachTrip b1 = new BeachTrip("Tur til Maldiverne", 12, "Maldiverne", 12000);

        System.out.println(s1.toString());
        System.out.println("----------------------");
        System.out.println(b1.toString());
    }
}
