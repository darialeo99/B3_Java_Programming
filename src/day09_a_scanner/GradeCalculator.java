package day09_a_scanner;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your yearly/ annual salary? $ ");
        double salary = input.nextDouble(); // 120,000.00

        System.out.print("How many hours do you work in a week? ");
        int hoursInWeek = input.nextInt();

        double hourlyRate = salary / (hoursInWeek * 52);

        System.out.println("With the annual salary of " + salary + " and working for " + hoursInWeek + " hours in a week, your hourly rate is $ " + hourlyRate);









    }
}
