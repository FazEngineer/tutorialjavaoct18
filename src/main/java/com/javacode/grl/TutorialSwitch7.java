package com.javacode.grl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TutorialSwitch7 {

    public static void main(String[] args){

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM");

        String month = dtf.format(localDate);
        String holidays;

        switch (month){

            case "January" : holidays = "New Years Eve";
            break;
            case "February" : holidays = "Valentines Day";
                break;
            case "March" : holidays = "St Patricks Day";
                break;
            case "April" : holidays = "Easter";
                break;
            case "May" : holidays = "Mother Day";
                break;

            default:holidays = "Invalid month";
            break;
        }

        System.out.println(holidays);

    }
}
