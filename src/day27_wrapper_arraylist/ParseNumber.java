package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {

        String year = "2024";

        // normal concatenation
        System.out.println("Current year: " + year);
        System.out.println("Next year will be: " + (year + 1));

        int yearInNum = Integer.parseInt(year); // int yearInNum = 2024; (not String anymore)
        System.out.println("Current year: " + yearInNum);
        System.out.println("Next year will be: " + (yearInNum + 1));

//        String s = "true";
//
//        if (Boolean.parseBoolean(s)){
//            System.out.println("hello");
//        }

        System.out.println("------------------------");

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your message in this format: I am $x years old");
        String str = key.nextLine(); // I am 30 years old

        // In 5 years, I will be $x + 5 years old

        String age = str.split(" ")[2]; // "30"
        int ageInNum = Integer.parseInt(age);
        //System.out.println("In this 5 years I will be " + (age + 5 ) + " years old"); // 305
        System.out.println("In this 5 years I will be " + (ageInNum + 5 ) + " years old"); // 35


    }
}
