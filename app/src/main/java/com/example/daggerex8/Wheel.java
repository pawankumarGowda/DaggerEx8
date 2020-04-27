package com.example.daggerex8;

public class Wheel {

    //Assuming this as a 3rd party library

    private Rims rims;
    private Tires tires;

    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
