package com.codeacademy;

// 1. Class - is a set of instructions that describe how a data structure should behave.
public class Dog extends Animal {

    private int age;

    /*
 2. Constructor - Start by creating the starting state of our class. We can do this by adding a class constructor to it.

A class constructor will allow us to create Dog instances. With a class constructor, we can set some information about the Dog.
If we do not create a class constructor, Java provides one that does not allow you to set initial information.
 */

    private Dog(int dogsAge) {

        // 4. Set instance variable equal to dogsAge

        age = dogsAge;


    }

// 3. Instance Variable - we have specific details that we want the class to include. We save those specific details into instance variables.

// 4. Constructor Parameters allow data types to be created with specified attributes.
    public int getAge(){

        return this.age;
    }

    public int setAge(int newSetAge){

       return this.age = newSetAge;
    }


    public void bark() {
        System.out.println("Woof!");
    }

    public void run(int feet){

        System.out.println("Your dog ran " + feet + " feet!");
    }

    //10. The void keyword (which means "completely empty") indicates to the method that no value is returned after calling that method.

//    public int getAge(){
//        return age;
//    }

    public static void main(String[] args) {

        // 5. When Java runs your program, the code inside of the main method is executed.
        // 6. Object - instance of Dog class
        //Inside of main, use the Dog constructor to create a Dog object and assign it to the variable spike. Make sure that you specify the required int parameter age.
        Dog spike = new Dog(5);
        spike.bark();
        spike.run(40);

        // 7. A method is a pre-defined set of instructions. Methods are declared within a class. Java provides some pre-defined methods available to all classes, but we can create our own as well.
        //In between the constructor and the main method, add a method called bark to the Dog class by typing:

        //8. Now the bark method is available to use on the spike object. Calling the method on spike.
        //9. Similar to constructors, you can customize methods to accept parameters.
        //Inside of the main method, call the run method on the spike object. You can pass in an int parameter of your choice.

        //10.

        int spikeAge = spike.getAge();
        System.out.println(spikeAge);


        spike.setAge(50);
        System.out.println(spike.getAge());

        spike.checkStatus();


    }


}
