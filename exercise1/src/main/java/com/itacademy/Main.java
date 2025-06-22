package com.itacademy;

import com.itacademy.instrument.Percussion;
import com.itacademy.instrument.Strings;
import com.itacademy.instrument.Wind;

public class Main {
    public static void main(String[] args) {
        Wind flute = new Wind("flute", 50);
        flute.play();

        Strings violin = new Strings("violin", 100);
        violin.play();

        Percussion drum = new Percussion("drum", 80);
        drum.play();
    }
}
