package day25_methods;

import my_utilities.StringUtil1;

/*
    Unique Characters

    create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

    Hint: use your frequency method to do some of the work

    Ex:
    Input:
        aaaaabcccdeeff

    Output:
        bd
 */
public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("hello")); // helo



    }

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

//            if (!unique.contains( eachLetter + "")){
//                unique += eachLetter;
//            }