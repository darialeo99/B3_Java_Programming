package day10_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {


/*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

 */

        Scanner key = new Scanner(System.in);

        System.out.println("What is your balance:  $ ");
        double balance = key.nextDouble(); // hardcoded

        System.out.println("How much you want to withdraw?  $");
        //double withDraw = 500; // hardcoded value
        double withDraw = key.nextDouble(); // Dynamic, not hardcoded


       // balance = balance - withDraw; // regular way
        balance -= withDraw; // shorthand operator

        if (balance < 0){
            System.out.println("You took too much money. $100 overdraft fee will be applied");
            balance = balance - 100;
            System.out.println("Your balance after fee $ " + balance);
        }else{
            System.out.println("Your balance after withdraw is $ " + balance);
        }



       // System.out.println("Your current balance: " + (balance-100));




    }
}
