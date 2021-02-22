package org.wengkai;

//: Wind.java
// Inheritance & upcasting
import java.util.*;

class Instrument {
    protected void play() { System.out.println("Instrument playing"); }
    static void tune(Instrument i) {
        i.play();
    }
}

// Wind object are instruments
// because then have the same interface:
class Wind extends Instrument {
    protected void play() { System.out.println("Wind playing"); }
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}