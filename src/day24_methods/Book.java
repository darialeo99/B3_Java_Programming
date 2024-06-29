package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner key = new Scanner (System.in);
        System.out.print("How many chapters are in the book: ");
        int num = key.nextInt();
        String [][] book = new String [num][];  // 2 ---> String [][] book = new String [2][]
        //String [][] book = new String [num][key.nextInt()] [];
        System.out.println(Arrays.deepToString(book));
        //System.out.println((book[0][0])); // .NullPointerException

        key.nextLine(); // for the excpetion of nextLine for Scanner method

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter paragrath for each chapter: ");
            String eachParagrath = key.nextLine();// Hello people! Welcome to our new class! Today we will cover methods!

            String [] eachSentence = eachParagrath.split("! "); // [Hello people!, Welcome to our new class! ,
            book [i] = eachSentence;

        }

        System.out.println(Arrays.deepToString(book));



    }
}
