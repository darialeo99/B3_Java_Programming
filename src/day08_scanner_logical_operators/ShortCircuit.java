package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {
        // System.out.println(5/0); we can not divide by 0

        System.out.println(true || 5/0 == 0); // shortcicuit operator OR ----> ||    , stops after running the first item as long as it knows the answer for ex: true || false will be
                                                                                        // true, so java does not bother to check after the first item (JAVA is LAZY!)
        //System.out.println(true | 5/0 == 0); // ERROR -----> OR ---> |  , it will check all the items in the statement


        System.out.println(false && 5/0 == 0); // shortcircuit AND ----> &&
        //                 false

        //System.out.println(false & 5/0 == 0); // shortcircuit AND ----> &&

        System.out.println("____________________________________________________");

        int a = 0;
        System.out.println(false && a++ == 5);
        System.out.println(a);

        System.out.println(true && a++ == 5);
        System.out.println(a);

        int b = 0;
        System.out.println(false & b++ == 5);
        System.out.println(b);


    }
}
