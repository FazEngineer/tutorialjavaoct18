package com.javacode.grl;

public class TutorialHelloWorldString4 {
    //class variable where String is an object of a class
    static String helloWorld = "Hello World!";

    public static void main(String args[]) {
        int letterCount = helloWorld.length();
        System.out.println(helloWorld  + " is a String class object that contains " + letterCount +" characters." );

        String c;
        c = String.format(helloWorld + " is a String class object with " + letterCount + " characters.");
        System.out.println(c);

        String d = Integer.toString(letterCount);
        System.out.println(d);

        char e = helloWorld.charAt(4);
        String f = Character.toString(e);

        System.out.println(e);
        System.out.println(f);

        String world = helloWorld.substring(6, 11);
        System.out.println(world);

        //toLowerCase() , toUpperCase() , trim()

    }


}
