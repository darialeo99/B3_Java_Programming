package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        /*
    create a program to guess the secret number.
    flow will be as follows:
    define the secret number, hard coded
    ask the user to guess a number
    based on the guess tell them a message:

    if they guess higher than the number:
      too high

    if they guess lower than the number:
      too low

    if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

    Challenge: keep track of the number of attempts taken to guess right
 */
        Scanner key = new Scanner(System.in);
        int secretNumber = 40;
        int userGuess;

        do {
            System.out.println("Guess a number from 1 to 100: ");
            userGuess = key.nextInt();

            if (userGuess > secretNumber){
                System.out.println(userGuess + " is higher. Guess again.");
            } else if (userGuess < secretNumber){
                System.out.println(userGuess + " is less. Guess again");
            }else {
                System.out.println("You guessed correctly");
            }



        } while (userGuess != secretNumber);
        System.out.println("You guessed correctly");




    }
}
