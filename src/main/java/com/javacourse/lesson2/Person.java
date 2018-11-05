package com.javacourse.lesson2;

import com.javacourse.lesson3.Name;

public class Person {
    // members of a class
                // reference variable - instance variable
                // by adding static - class variable and class method if you change instance it changes it in anothers

    // Default constructor - used to intialise object

    private  Name personName;
    private static int personCounter;

    public Person(){

        //instance variable
        personCounter++;

        /*
        empty og purpose - default constructor
        */
    }
    public Person( Name personName){
        // instance       value
        this.personName = personName;

    }


    // instance methods
    public String helloWorld() {
        return "Hello World";
    }


    public Name name(){
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;


    }


    public static int numberOfPersons() {
        return personCounter;
    }
}
