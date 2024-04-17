package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        /*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
 */
        Scanner input = new Scanner (System.in);

        System.out.println("Enter 3 angles in degrees: ");
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double total = angleOne + angleTwo + angleThree;

        boolean isTriable = total == 180;
        boolean isCircle = total == 360;

        System.out.println("It is a triangle: " + isTriable);
        System.out.println("It is a circle: " + isCircle);

    }
}
