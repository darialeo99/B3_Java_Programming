package day12_switch_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("***Welcome to ATM***");
        System.out.println("\n\nPlease enter your card.  \nThen type your pin code");
        int userInputPin = input.nextInt();

        int expectedPin  = 6789;
        double balance = 1_000_000.00;

        // Outer if, parent iff
        if (userInputPin == expectedPin){
            System.out.println("You are logged in");

            System.out.println("Select a number for your operation: ");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.println("\nYour choice");

            int option = input.nextInt();
            // inner if - child if - nested if
            if (option == 1){
                System.out.println("Your balance is $" + balance);
            }else if (option == 2){
                System.out.print("How much do you want to withdraw? $");
                double withDrawAmount = input.nextDouble();
                System.out.println("Stand By... Withdrawing $ " + withDrawAmount);
                balance = balance - withDrawAmount; // balance -=WithDrawAmount;
                System.out.println("After you have withdrawn , your balance if $" + balance);

            } else if (option == 3) {
                System.out.println("Please insert the money: $");
                double deposit = input.nextDouble();
                balance = balance + deposit; // balance += deposit;
                System.out.println("After you deposited , your balance if $" + balance);

            }else{
                System.out.println("Invalid selection. Exiting the account");
            }



        }   else {
            System.out.println("Invalid pincode");

        }
    }
}
