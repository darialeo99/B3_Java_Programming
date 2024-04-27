package day18_loops;

public class CountChars {
    public static void main(String[] args) {
        /*
                Count upper, lower, and numbers
                    Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
                    Ex:
                    Input: 2juMp41EEkd4s4

                    Output:
                    3 uppercase letters
                    6 lowercase letters
                    5 numbers
 */


        String str = "2juMp41EEkd4s4";

        int UpperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int others = 0; // left over letters that do not fall into any of these mentioned above categories

        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);  // gives me each character

            if (eachLetter >= 'A' && eachLetter <= 'Z'){
                UpperCount++;

            }else if (eachLetter >= 'a' && eachLetter <= 'z'){
                lowerCount++;
            }else if (eachLetter >= '0' && eachLetter <= '9'){ // 0 (int) is different than '0'(character from ASCII table)
                numCount++;
            }else{
                others++;
            }

        }

        System.out.println("Uppercase letter count: " + UpperCount);
        System.out.println("Lowercase letter count: " + lowerCount);
        System.out.println("Numbers letter count: " + numCount);
        System.out.println("Other letter count: " + others);







    }
}
