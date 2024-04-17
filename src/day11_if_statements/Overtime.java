package day11_if_statements;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {

        /*

    create a double variable for your hourly rate
    create a double variable for the number of hours worked per week

    calculate your net pay, with consideration of overtime pay

        if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
            (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */

        Scanner key = new Scanner (System.in);
        //double hourlyRate = 40; // hardcoded
        System.out.println("Enter your hourly rate: ");
        double hourlyRate = key.nextDouble();

        System.out.println("Enter your total hours: ");
        double numOfHours = key.nextDouble();  // ----> 43

        double netPay;

        String message = "";

        //boolean isOverTime = numOfHours > 40;

        //double overTimeRate = hourlyRate * 1.5;

        if (numOfHours >  40){ //43 hours --> 40 * regular rate + 3 * OvertimeRate
            netPay = 40 * hourlyRate; // netpay with regular hours and hour pay
            netPay = netPay + ((numOfHours - 40) * (hourlyRate * 1.5)); // regular 40 hours + overtime calculation
            // regular 40 hours + (overtime hours * overtime rate)
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate + ". Since you have overtime, your total pay is $" + netPay;
        }else {
            netPay = numOfHours + hourlyRate;
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate + ". There was no overtime, your total pay is $ " + netPay;
        }

        System.out.println(message);

        System.out.println(netPay);




    }

    // netPay
}
