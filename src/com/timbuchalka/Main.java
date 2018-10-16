package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //we can implement comparable interface or we can make class Comparator
    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
          //they are separate arrays but contains the same references to objects


        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);  //sort by the price
        printList(priceSeats);
    }


    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }















}
