package com.com.ors;

public class Main {
    public static void main(String[] args){

        Animal camel = new Camel();
        Animal lion = new Lion();

        System.out.println(camel.diet());
        System.out.println(lion.diet());

    }
}
