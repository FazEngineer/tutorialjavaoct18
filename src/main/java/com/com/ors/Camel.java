package com.com.ors;

public class Camel implements Animal {


    @Override
    public String diet() {
        return "Plant";
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
}
