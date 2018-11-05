package com.codenation;

public class OOP1intro {

    // Make 3 variables; one storing a string, one a number and the other a boolean

    String stringVariable = "This is a string";
    int integerVariable = 100;
    boolean trueOrFalse = true;


    public static void main(String[] args) {

        // Make an array that stores 4 items; add something to the end of the array using a method

        String[] names = {"Bob", "Kate", "Malcolm", "Sarah"};

        System.out.println(names.length);

        // Create a loop to cycle through the array to print out all the values

        int[] size = new int[3];

        size[0] = 1;
        size[1] = 2;
        size[2] = 3;

        for (int i = 0; i < size.length; i++) {

            System.out.println(size[i]);

        }


    }


}




