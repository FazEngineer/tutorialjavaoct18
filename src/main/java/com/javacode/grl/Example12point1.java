package com.javacode.grl;

import java.util.HashSet;

public class Example12point1 {

    public void printNumbers(HashSet<Integer> numHashSet){

        for (int x: numHashSet){

            System.out.println(x);
        }
    }

    public static void main(String[] args){

        HashSet<Integer> numberSet = new HashSet<Integer>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);

        Example12point1 myObject = new Example12point1();
        myObject.printNumbers(numberSet);

        numberSet.forEach(System.out::println);


    }
}
