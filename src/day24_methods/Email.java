package day24_methods;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {

        buildEmail("Micky Mouse", "gmail.com");
        buildEmail("Tom Jerry", "yahoo.com");





    }

    // Create a method that is called buildEmail that accepts two String parameters
    // take the full name and then take FIRST character of first name and full last name and concatenate with domain
    // "Micky Mouse", "Gmail" ==> mmouse@gmail.com

    public static void buildEmail (String fullFame, String domain){  // Non-parameterized method ----> (). (Now it accepts 2 parameters)

        String email = fullFame.toLowerCase().charAt(0)// getting first letter which is m and getting the second word after the space " " ----> m + mouse
                + ""  + fullFame.toLowerCase().substring(fullFame.indexOf(" " ) +1 ) + "@"
                + domain.toLowerCase();
        System.out.println(email);



    }


}
