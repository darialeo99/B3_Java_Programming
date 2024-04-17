package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int n = 20;

        System.out.println(n > 5); // true
        System.out.println(n < 10); // false


        System.out.println(n > 5 && n < 10); //     && - means AND
        //                 true && n < 10
        //                 true && false // with && (AND) both sides have to be true for the outcome to be true
        //                 false

        System.out.println("_____________________________________");

        System.out.println(4 > 3 || false);  //       || - means OR
        //                 true || false     // both sides have to be false for the outcome to be false
        //                 true

        System.out.println(3 > 4 || false);
        //                 false || false
        //                 false

        System.out.println("__________________________________________________");
        System.out.println(!true); // not true ---> false
        System.out.println(!true); // not false ---> true

        System.out.println(!(4 != 4)); // not equal
        // four is not equal to four ---> false




    }
}
