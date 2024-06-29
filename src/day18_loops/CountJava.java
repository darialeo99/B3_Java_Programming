package day18_loops;

import org.w3c.dom.ls.LSOutput;

public class CountJava {
    public static void main(String[] args) {
        /*
        java is java  -- 12
        0123456789



        java -- length(); - 4
        0123
         */

        String str = "java is a java language java";
        int countJava = 0;

        for (int i = 0; i <= str.length() - 4 ; i++) {   // or i < str.length() = 3

            String everyFour = str.substring(i, i + 4);

            if (everyFour.equals("java")){
                countJava++;
            }

        }
        System.out.println(countJava);

    }


}
