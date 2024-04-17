package day12_switch_statements;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner key  = new Scanner (System.in);
        System.out.print("Please enter a day number [1-7]: ");
        int num = key.nextInt();
        String message = "";

        switch (num){
            case 1:
                message = "Monday";
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number is not between 1-7");
        }
        System.out.println(message);
    }
}
