package com.javacode.grl;

public interface TutorialCollectionsAndInterface12 {

    // An interface is a contract: The person writing the interface says, "hey, I accept things looking that way", and the person using the interface says "OK, the class I write looks that way".
    // An interface in java is a blueprint of a class. It has static constants and abstract methods.
    // An interface - Only contain Constants, Method Signatures, Default Methods, Static Methods, Nested Types
    // declares variables as a constant - keyword
    // Interface Collection extends Interface Iterable

    final int NUMBER_OF_HOURS_IN_A_DAY = 24;

    // Method signatures - is the method name and the number, type and order of its parameters.
    boolean isCorrect();
    int getAge();
    void setAge(int age);
}
