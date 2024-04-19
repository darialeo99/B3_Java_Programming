package day14_string;

public class RecapMethods {
    public static void main(String[] args) {
        String s = "pen"; // s is a String declared by LITERALS and stored in STRING POOL in HEAP
        String s2 = new String("pen"); // s2 is a String object declared by "new" keyword and stored in HEAP

        // TODO: check the execution flow.
        System.out.println("Compare with == :\t\t\t" + (s == s2)); // == ---> compares the memory location and that's why it is false
        System.out.println("Compare with .equals(): \t" + s.equals(s2)); // .equals(); ---> compares the values, since they are equal result is true
        System.out.println("Compare with == :\t\t\t" + s.equals("Pen")); // pen VS Pen ---> false
        System.out.println("Compare with == :\t\t\t" + s.equalsIgnoreCase("Pen")); // pen vs Pen ---> true [ignoring the case sensetivness]

        boolean isSame = s.equalsIgnoreCase("PENN"); // pen vs PENN

        if (isSame){
            System.out.println("By ignoring the case sensetivness the result is true");
        }else{
            System.out.println("Even ignoring the case sensetiveness, the result is false");
        }



        int numOfCharacters = s.length(); // returns number in int datatype
        System.out.println("Number os characters in s2: " + numOfCharacters);

        int a = 9;
        // a.length() // cannot do this cause .length() method belongs to String class
        int num  = (a + "").length(); // a + "" ----- "9" ----> 1 (length of the string is 1)
        System.out.println(a); // int datatype
        System.out.println((a + "").length()); // a + "" ----- "9" ----> 1 (length of the string is 1)
        System.out.println(a + "");  // 9 + "" -----> "9" (String)

        if (num % 2 == 0){
            System.out.println("length of num is even number");
        }else{
            System.out.println("length of num is odd number");
        }

        String word = "loopcamp";
        if (word.length() % 2 == 0){
            System.out.println("length of num is even number");
        }



    }
}
