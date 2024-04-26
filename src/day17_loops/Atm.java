package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);



        int validPin = 9812;
        int userInput;
        int attempts = 0;

        System.out.println("Welcome to atm");


        do {
            System.out.println("Please enter your pin: ");
            userInput = key.nextInt(); // 1234 | 9812

            attempts++; // 1 | 2

        } while (attempts < 3 && userInput != validPin); // input does not match the correct PIN meaning 1234 != 9812


        if (validPin == userInput){
            System.out.println("Logged In");
        }else{
            System.out.println("Locked out, come after a week");
        }




        }






    }
