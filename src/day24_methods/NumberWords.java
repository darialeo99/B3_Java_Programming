package day24_methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number and I will convert it into text: ");
        int userNum = key.nextInt();

        System.out.println(numberAsWord(userNum));

    }



    // Make a method that takes a number and returns word format of it.(1-10)
    // 1 ---> one
    // 8 ---> eight

    public static String numberAsWord(int num) { // accepts the number
        String result = "";

//        if (num == 1){
//            result = "One";
//
//        }else if (num == 2){
//            result = "Two";
//        }....
//        }else{
//            result = "Number is not between 1-10"
//        }

//        switch (num){
//            case 1:
//                result = "One";
//                break;
//            case 2:
//                result = "Two";
//                break;
//            default:
//                result = "Number is not between 1-10";
//        }
//


        String [] days = {"", "One", "Two", "Three"}; // and so on.....

        if (num >= 1 && num <=10){
            result = days [num];

        }else{
            result = "Number is not between 1-10";
        }


        return "";                        // returns the String format
    }
}
