package com.javacode.grl;

public class TutorialIfElse5 {

    int age;

    public void verifyAge(int age) {

        if (age >= 18) {

            System.out.println("You are an adult.");
        } else if (age == 17) {

            System.out.println("You will be an adult in 1 year");
        } else {

            System.out.println("You are not an adult.");
        }

    }

    public void newYear(int age) {
        age++;
        this.age = age;
    }
    public static void main(String args[]) {

        TutorialIfElse5 michelle = new TutorialIfElse5();
        michelle.age = 16;
        michelle.verifyAge(michelle.age);
        System.out.println(michelle.age);

        michelle.newYear(michelle.age);
        michelle.verifyAge(michelle.age);
        System.out.println(michelle.age);

        michelle.newYear(michelle.age);
        michelle.verifyAge(michelle.age);
        System.out.println(michelle.age);
    }
}
