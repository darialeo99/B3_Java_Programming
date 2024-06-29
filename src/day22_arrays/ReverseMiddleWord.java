package day22_arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        /*
    Have a sentence with 3 words
    reverse the middle word

    ex:
        java always fun

        output:
            java syawla fun
 */
        String str = "java always fun";

        String [] words = str.split(" "); // ["java", "always", "fun]

        char [] letters = words[1].toCharArray(); // ['a', 'l', 'w', 'a','y', 's']
        String reverse = "";

        for (int i = letters.length-1; i >= 0 ; i--) {

            reverse += letters[i];

        }
        System.out.println(reverse);

        System.out.println(words[0] + " " + reverse + " " + words[2]);







    }
}
