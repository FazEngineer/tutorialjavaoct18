package com.com.ors;

// Abstract class mix of concrete and interface- You cannot instantiate this class
// Concrete class
public class Lion implements Animal {


    @Override
    public String diet() {
        return "meat";
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
}