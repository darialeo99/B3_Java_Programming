package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        /*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */
        Scanner input = new Scanner(System.in);

        System.out.print("What day do you want to know about? ");
        String day = input.next();

        String information = "";

        switch (day){
            case "Monday": // MON, Mon, monday
            case "Mon":
            case "monday":
                information = "We have mentor sessions";
                break;
            case "Tuesday":
                information = "We do not have class";
                break;
            case "Wednesday":
            case "Thursday":
                information = "We have Java";
                break;
            case "Friday":
                information = "No Class";
                break;
            case "Saturday":
                information = " Java Class";
                break;
            case "Sunday":
                information = "Soft skills";
                break;
            default:
                information = "Not valid";



        }

        System.out.println(information);

    }
}
