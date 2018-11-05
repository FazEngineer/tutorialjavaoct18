package com.codeacademy;

// 2.Class - Is a set of instructions describing how the data structure should behave.
public class Car extends Vehicle{

// 4.   Instance variable - Instance variable in java is used by Objects to store their states. Variables which are defined without the STATIC keyword and are Outside any method declaration
// are Object specific and are known as instance variables.
// They are called so because their values are instance specific and are not shared among instances.
    private int modelYear;
    //12. getters and setters
    public int getModelYear(){
        return modelYear;
    }

    public void setModelYear(int newYear){
        this.modelYear = newYear;
    }

// 3. Constructor - instructs the class to setup the initial state of an object.
    public Car(int year){
//5.
        this.modelYear = year;
    }

    //6.
    public static void main(String[] args){
//7. Object - An instance of a class is known as an object in Java.
        Car myCar = new Car(2007);
//9. Calling a method on an object using the Car class
        myCar.startEngine();
        myCar.drive(200);
        int tires = myCar.numberOfTires(8);
        System.out.println(tires);
        myCar.checkBatteryStatus();
        myCar.getModelYear();
        System.out.println(myCar.getModelYear());
        myCar.setModelYear(1210);
        System.out.println(myCar.getModelYear());

    }

    //8. A method is a pre-defined set of instructions
    public void startEngine(){
        System.out.println("Vroom!");
    }

    //10.
    public void drive(int distanceInMiles){
        System.out.println("Miles driven: " + distanceInMiles);
    }

    //11.

    public int numberOfTires(int type){

        return type;
    }
}
