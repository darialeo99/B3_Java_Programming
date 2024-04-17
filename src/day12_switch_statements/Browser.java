package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your browser: ");
        String browserType = input.next();

        switch (browserType){
            case "Chrome":
                System.out.println("opening Google in Chrome browser.");
                //break;
            case "Firefox":
                System.out.println("opening Google in  browser.");
                //break;
            case "Safari": // browserType == Safari || browserType == safari;
            case "safari":
                System.out.println("opening Google in Safari browser.");
                break;
            default:
                System.out.println("We do not have " + browserType + " browser type or it is invalid one");
        }


    }
}
