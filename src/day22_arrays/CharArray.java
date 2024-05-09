package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String str = "loopcamp";
        char [] letters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            letters[i] = str.charAt(i);

        }

        System.out.println(Arrays.toString(letters));

        // The method .toCharArray(); converts the String into char [] --- this will do the same thing as above

        char [] letters2 = str.toCharArray();
        System.out.println(Arrays.toString(letters2));

        System.out.println("--------------------------");

        String word = "java";

        //word.toCharArray(); "java" ---->['j' , 'a', 'v' , 'a']

        for (char each : word.toCharArray()){
            System.out.println(each);
        }

        System.out.println("--------------------");

        char [] letters3 = {'j' , 'a', 'v' , 'a'};
        System.out.println(Arrays.toString(letters3));

        for (char each : letters3){
            System.out.println(each);
        }


        System.out.println("----------------------");
        // Converting chars to String , this is how we convert char Array into String
        char [] letters4 = {'h' , 'e' , 'l', 'l', 'o' };
        String str2 = new String(letters4);
        System.out.println(str2);

        String [] words = {"hi" , "buy"};
        //String str3 = new String (words); // INVALID - it only words with CHAR ARRAY


        System.out.println("---------------------");

        String s = "Jerry";
        char [] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));

        String s2 = new String (ch);
        System.out.println(s2);

    }
}
