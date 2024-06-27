package day43_a_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "loopcamp";
        frequencyOfCharacters(word);



    }

    /*
    l-1
    o-2
    p-2
    c-1
    a-1
    m-1
     */

    public static void frequencyOfCharacters(String word) { // loopcamp

        Map<Character, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < word.length() ; i++) { // with this loop I want to loop through word and let each character

            char eachChar = word.charAt(i); // getting each character

            if (!map.containsKey(eachChar)) { //L//O//O    // Check if key does not have it
                map.put(eachChar, 1);

            } else { // if key already has it (the letter is already added into the table)

                map.put(eachChar, map.get(eachChar) + 1);

            }

            //map.put(eachChar, 1);

        }

        System.out.println(map);

    }
}
