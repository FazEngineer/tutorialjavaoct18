package com.javacode.grl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TutorialFormatDate6 {

    public static void main(String[] args){

        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM, YYYY h:mm a");
        System.out.println(dtf.format(localDate));
    }
}
