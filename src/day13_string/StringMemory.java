package day13_string;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {
        String first = "java"; // Option 1 - BY STRING LITERALS - just a double quotation

        // We actually create the object
        String second = new String("java"); // OPTION 2 - BY NEW KEYWORD// second is not a variable it's "object reference", while "java" is a parameter

        System.out.println(first);
        System.out.println(second);

        String third = "java";

        String four = "javac";

        System.out.println("_________________________________");

        System.out.println(first == second); // false// because they are in different places "location" one in string pool another directly in the heap
        System.out.println(second == third); // false // because they are in different places one in string pool another directly in the heap
        System.out.println(first == third); // true// noth made by string literals
        System.out.println(first = four);

        String five = new String("java");

        System.out.println(second == five);



        // == -------> with this relational operator , when it is used with String, it compares the MEMORY LOCATION


    }

}
