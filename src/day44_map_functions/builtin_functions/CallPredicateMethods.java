package day44_map_functions.builtin_functions;

public class CallPredicateMethods {

    public static void main(String[] args) {

        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicate.isPalindrome.test("apple"));

        System.out.println(UsePredicate.isPrime.test(8));


    }
}
