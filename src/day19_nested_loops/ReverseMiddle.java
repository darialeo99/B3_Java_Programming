package day19_nested_loops;

public class ReverseMiddle {
    public static void main(String[] args) {

        /*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
 */


        String str = "I love java";
                   // 0123456789
        int firstSpaceIndex = str.indexOf(" ");  // index of 3
        int lastSpaceIndex = str.lastIndexOf(" "); // index of 8

        String middleWord = str.substring(firstSpaceIndex + 1, lastSpaceIndex);

        System.out.println(middleWord);
        
        String reversed = "";

        for (int i = middleWord.length() - 1; i >= 0 ; i--) {

            reversed += middleWord.charAt(i);
            
        }

        System.out.println(reversed);

        System.out.println(str.substring(0,firstSpaceIndex + 1) + reversed + str.substring(lastSpaceIndex));





    }
}
