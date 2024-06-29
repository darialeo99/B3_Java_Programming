package my_utilities;

public class StringUtil1 {


        /**
         * Returns the reversed version of string.
         *
         * @return  the reversed sequence of characters in String
         */
        public static String reverse (String word) {

            String reversed = "";
            for (int i = word.length() - 1 ; i >= 0 ; i--) {

                reversed += word.charAt(i);
            }
            return reversed;
        }

    /**
     * Returns the formatted version of string.
     *
     * @return  the first letter in UPPER case and rest in Lowercase as String
     */

    public static String FixFormat (String str){

        String result = "";

        //result = (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();  //with CharAt() method
        result = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();  // substring method

        return result;

    }


    /**
     * Returns the number of the characters repeated in String
     * @param word is the String that the method will check
     * @param letter is the char the the method will check how many times it appear
     * @return the number of the letter that occurred in String
     */
    public static int frequencyOfCharacters (String word, char letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }

        }

        return count;
    }


    /**
     * This method returns only unique characters
     * @param str- is the word that is being checked for unique chars
     * @return the unique letter as a String
     */



    public static String uniqueCharacters (String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);



            if (StringUtil1.frequencyOfCharacters(str, eachLetter) == 1){
                unique += eachLetter;



            }


        }

        return unique;
    }
}








