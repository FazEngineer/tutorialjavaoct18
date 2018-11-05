package com.codenation;

public class Food {

    private int Snicker = 1;
    private int Topic = 0;

    public void sweets() {

        if (Snicker == 0 || Topic == 1) {

            System.out.println("Good Choice");

        } else {

            System.out.println("Not Good choice");
        }
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.sweets();
    }
}
