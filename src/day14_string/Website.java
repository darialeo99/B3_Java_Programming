package day14_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        /*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net

      in cases it is not valid, tell the reason why

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a website:  ");
        String url = input.next().toLowerCase(); // WWW.loopcamp.oi ----> www.loopcamp.oi

        boolean isValidStart = url.startsWith("www.");
        boolean isValidEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(" net") || url.endsWith(".io"); // www.google.com

        if (isValidStart && isValidEnd){
            System.out.println("It is a valid website");
        }else{
            System.out.println("it is invalid website.");

            if(!isValidStart){
                System.out.println("It was invalid start");
            }

            if (!isValidEnd){
                System.out.println("It was invalid end");
            }
        }
    }
}
