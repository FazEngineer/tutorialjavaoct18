package com.codenation;



public class Animal {
    // Class variable - Save specific details of a class into here
    private boolean isHappy;
    private boolean needsToPlay;
    private boolean isHungry;
    private boolean isThirsty;

    // Constructor
    public Animal() {
        this.isHappy = true;
        this.needsToPlay = false;
        this.isHungry = false;
        this.isThirsty = false;

    }

    public boolean getHappyLevel(){
        return isHappy;
    }

//    public void setIsHappy(boolean animalMood){
//        this.isHappy = animalMood;
//    }

    public boolean getNeedsToPlay(){
        return needsToPlay;
    }

    public void setNeedsToPlay(boolean active ){
        this.needsToPlay = active;
        checkHappyLevel();
    }

    public boolean getHungry(){
        return isHungry;
    }

    public void setHungry(boolean fed ){
        this.isHungry = fed;
        checkHappyLevel();
    }

    public boolean getThirsty(){
        return isThirsty;
    }

    public void setThirsty(boolean watered){
        this.isThirsty = watered;
        checkHappyLevel();
    }

    private void checkHappyLevel(){

        if(!needsToPlay && !isHungry && !isThirsty){
            isHappy = true;
            System.out.println("Is happy");
        }

        else {
            isHappy = false;
            System.out.println("Is not happy");

        }

    }


}
