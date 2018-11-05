package com.javacode.grl;

public class TutorialDog2 {

    int age; // Instance Variable
    String name;
    static int numberOfLegs = 4; // class variable - static field - remain the same when you create a new object - class
    public void about(int a, String name){ // parameter variables are arguments that are passed into a method
        int nextYear = a + 1; // local variables
        System.out.println("This dog is " + a + ".");
        System.out.println("All dogs have " + numberOfLegs + " legs.");
        System.out.println("Next year this god will be " + nextYear + " years old.");
        System.out.println( name + " is " + age + ".");
    }

    public static void main(String[] args){


        TutorialDog2 joey = new TutorialDog2();
        // Instance Variable - - None static fields unique to a specific object
        joey.age = 5;
        joey.name = "Joey";
        joey.about(joey.age, joey.name);

        TutorialDog2 charles = new TutorialDog2();
        charles.age = 3;
        charles.name = "Charles";
        charles.about(charles.age, charles.name);

        TutorialRottweiler3 joeys = new TutorialRottweiler3();
        joeys.age = 5;
        joeys.name = "Joey";
        joeys.about(joey.age, joey.name);
        joeys.example(TutorialRottweiler3.furColour);
    }

}
