package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,2,27,40,234,38));
        System.out.println(list);

        //.sort();

        Collections.sort(list); // sorted in ascending order
        System.out.println(list);

        // .reverse();

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("----------------");

        ArrayList <Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'D', 'C'));
        System.out.println(letters);
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println("-----------------");

        // max () and min () methods from Collections
        // 3,6,2,27,40,234,38

        System.out.println( Collections.max(list));
        System.out.println( Collections.min(list));

        // .swap();

        Collections.swap(letters, 0, 3); // changed their locations
        System.out.println(letters);

        // .frequency

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(11,11,20,11,20,30));
        // [11,11,20,11,20,30]
        // ["a" , "b" , "c", "a", "c"]
        // "aaabbbbccccdde"
        System.out.println(Collections.frequency(numbers, 11));

        String str = "aaabbbbccccdde";
        ArrayList <String> word = new ArrayList<>(Arrays.asList(str.split(""))); // {"a" , "a", ....}

        String checked = "";

        for (String each : word){
            if (!checked.contains(each)){
                System.out.println(each + ": " + Collections.frequency(word, each));
                checked += each;
            }

        }

        ArrayList <String> strArrList = new ArrayList<>(Arrays.asList("one", "two", "five", "five", "ten"));
        System.out.println(  Collections.frequency(strArrList, "six")  );
        System.out.println(  Collections.frequency(strArrList, "five")  );
        System.out.println(  Collections.frequency(strArrList, "ten")  );




    }
}
