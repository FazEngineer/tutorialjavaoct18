package com.javacode.grl;

public class TutorialExample10 {

    public static void main(String args[]) {

/*

public means that the method is visible and can be called from other objects of other types. Other alternatives are private, protected, package and package-private. See here for more details.

static means that the method is associated with the class, not a specific instance (object) of that class. This means that you can call a static method without creating an object of the class.

void means that the method has no return value. If the method returned an int you would write int instead of void.
*/

        TutorialGettersSetters10 myObject = new TutorialGettersSetters10();
        myObject.setEmailAddress("a@test.com");
        System.out.println(myObject.getEmailAddress());


    }
}
