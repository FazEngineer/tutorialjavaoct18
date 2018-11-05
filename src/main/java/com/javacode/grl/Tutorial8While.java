package com.javacode.grl;

public class Tutorial8While {


    public static void main(String args[]){

//        int roomsAvailable = 10;
//        while(roomsAvailable >=1){
//
//            System.out.println("This hotel has " + roomsAvailable + " rooms left!");
//
//            roomsAvailable--;
//        }


        int roomsAvail = 0;

        do{

            System.out.println("This hotel has " + roomsAvail + " rooms left!");

            roomsAvail--;

        }while(roomsAvail >=1);
    }

}
