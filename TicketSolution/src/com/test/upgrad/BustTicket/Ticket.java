package com.test.upgrad.BustTicket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ticket {

    List<Bus> busList = new ArrayList<>();

    public void addTicket(String sourcePlace, String destination, int charge) {
        Bus bus = new Bus(sourcePlace, destination, charge);

        busList.add(bus);
    }

    public List<String> getAllCity() {
        List<String> cities = new ArrayList<>();

        for(Bus b : busList) {
            if(!cities.contains(b.sourcePlace))
                cities.add(b.sourcePlace);
            if(!cities.contains(b.destinationPlace))
                cities.add(b.destinationPlace);
        }

        Collections.sort(cities);
        System.out.println(cities);
        return cities;
    }

    public List<String> getDestinationCities(String sourcePlace) {

        List<String> destCities = new ArrayList<>();
        for(Bus b: busList) {
            if(sourcePlace.equals(b.sourcePlace))
                destCities.add(b.destinationPlace);
        }
        Collections.sort(destCities);
        System.out.println(destCities);
        return destCities;
    }


    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.addTicket("Delhi", "Noida", 100);
        ticket.addTicket("Noida", "Mathura", 150);
        ticket.addTicket("Noida", "Sagar", 500);

        ticket.getAllCity();
        ticket.getDestinationCities("Noida");
    }
}
