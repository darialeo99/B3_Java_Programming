package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        /*

    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers

 */

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a number so, I can return you the Month name related to that number.");


        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // 12
        //                    0      1      2      3      4      5      6      7      8      9      10     11

        //System.out.println(months.length);

        //System.out.println(months[0]);
        //System.out.println(months[months.length-1]);


        int num;
        do {

            System.out.print("Enter: ");
            num = key.nextInt();

            if (num >= 1 && num <= 12) {
                System.out.println("The number you entered is: " + months[num-1]);
            } else {
                System.out.println("Wrong Input. There is no month for that number: " + num + " Try again!");
            }


        } while (num < 1 || num > 12);


        // Positive test: Making sure I am getting expected result for the VALID INPUTS
        // Negative test: Making sure I am getting expected "Error" or whatever is my expected for INVALID INPUT



    }
}
