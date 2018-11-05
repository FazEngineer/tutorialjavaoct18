package  com.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest{

    @Test
    public void shouldReturnHelloWorld(){

        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        // create an object type person calling a default constructor

        Person person = new Person();                     // argument
        assertEquals("Hello Marcus", person.hello("Marcus"));


    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4,Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop(){

       for(int i = 0; i <4; i++ ){

       }
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4,Person.numberOfPersons());

    }



    @Test
    public void demonstrateBoolean(){
        int i = 4;
        int j = 3;
        boolean monday = false;
        boolean raining = true;

        if (shouldDrinkBeer(i, j, monday, raining)){
            drinkBeer();
        }
        if(i == j){

            raining = true;
        }
        if(monday || raining){

            i = 34;
            j = 91;
            i = i + j;
            drinkBeer();
        } else if(j > i){
            i++;
            j = 56;
        } else if (i != j) {
            i = 8;
        }
        else{

            j--;
        }

    }

    private void drinkBeer() {
    }

    private boolean shouldDrinkBeer (int i, int j, boolean monday, boolean raining){
        return i < j || ((monday && !raining) || j > 3);
    }

}





