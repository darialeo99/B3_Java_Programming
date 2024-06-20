package day40_exception.learn_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {


            System.out.println("Enter a number");
            int userNum = input.nextInt();  // InputMismatchException


            System.out.println("Enter another number: ");
            int userNum2 = input.nextInt();  // InputMismatchException

            System.out.println(userNum / userNum2);  // ArithmeticException

        } catch (InputMismatchException e) {
            e.printStackTrace(); // show me the exception in details on CONSOLE

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("FINALLY BLOCK");
            input.close(); // To close the Scanner
        }




        System.out.println("DONE");





    }
}
