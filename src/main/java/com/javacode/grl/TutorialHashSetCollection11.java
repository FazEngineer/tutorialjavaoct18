package com.javacode.grl;

// HashSet - is a member of the java collections framework
// Implementation of the Set interface and set extends collection.
// Collection is an object that groups multiple elements into a single unit.
// Class HashSet - implements Interface Set which extends Interface Collection
// no duplicate elements

import java.util.HashSet;
import java.util.Iterator;

public class TutorialHashSetCollection11 {

    public static void main(String[] args){

        HashSet<String> classSet = new HashSet<String>();
        classSet.add("Julia Kate");
        classSet.add("Ava Jane");
        classSet.add("Jason Charles");

        HashSet<String> newToClass = new HashSet<String>();
        newToClass.add("Ava Jane");
        newToClass.add("Zain Lynch");

        classSet.addAll(newToClass);

        if(classSet.contains("Julia Kate")){

            classSet.remove("Julia Kate");
        }

        System.out.println(newToClass);
        System.out.println(classSet);

        Iterator<String> iterator = classSet.iterator();
        while (iterator.hasNext()){

            System.out.println("Name: " + iterator.next());
        }
    }

}
