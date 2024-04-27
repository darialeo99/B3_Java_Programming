package day18_loops;

public class CharactersInString {
    public static void main(String[] args) {
/*
Given s String print the acsii value codes for each character
 ex:

 input:
 Java

 output:
  106 98...
 */

        String str = "java";

        for (int i = 0; i < str.length(); i++) {

            //int numChar = str.charAt(i);  line 20,21 another method
           // System.out.println(numChar);
            System.out.println((int)str.charAt(i)); // casting to int

        }


    }
}
