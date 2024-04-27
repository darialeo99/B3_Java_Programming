package day18_loops;

public class Syllables {
    public static void main(String[] args) {
        /*
        Given s String separated by dashes, calculate how many syllables the word has

        Input:
         ja-va

         output:
         2
         */


        String str = "ja-va";

        int countDash = 0; // int countDash = 1; instead of line 26 countDash + 1 (another way)

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == '-'){
                countDash++;
            }

        }
        System.out.println("Number of syllables: " + (countDash + 1));


    }
}
