package day44_map_functions.builtin_functions;

import java.util.function.Predicate;

public class UsePredicate {

    public static Predicate<String> isPalindrome = (str) -> {

        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse); // returns boolean

    };

    public static Predicate <Integer> isPrime = (number)-> {

        int counter = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                counter++;

            }

        }

        if (counter == 2)  {
            return true;
        }else {
            return false;
        }

    };
}

/**
 * I have create one class that has used the Predicate functional interface
 * and had two different implementations of test() method
 */