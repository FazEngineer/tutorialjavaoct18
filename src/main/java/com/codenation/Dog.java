package com.codenation;

public class Dog extends Animal{

    public  Dog(){
     super();
    }


    public static void main(String[] args){

        Animal dog = new Dog();
        dog.setHungry(false);
        System.out.println("Hungry: " + dog.getHungry());
        System.out.println("Happy: " + dog.getHappyLevel());

    }

}
