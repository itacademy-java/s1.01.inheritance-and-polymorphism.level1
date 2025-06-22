package com.itacademy.instrument;

public class Percussion extends Instrument {

    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Percussion instrument sounds.");
    }
}