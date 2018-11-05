package com.codenation;

public class CashMachine {

    private int balance;


    // Create a function that when called asks you to withdraw an amount. Balance should reduce as appropriate.


    public CashMachine(int amount) {

        balance = amount;

    }

    public void withDrawal(int takeout) {

        balance = balance - takeout;

    }

    public static void main(String[] args) {


        CashMachine cash = new CashMachine(2007);
        cash.withDrawal(50);
        System.out.println(cash.balance);
        cash.withDrawal(50);
        System.out.println(cash.balance);



    }
}