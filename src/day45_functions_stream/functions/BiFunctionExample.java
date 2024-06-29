package day45_functions_stream.functions;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        // <T t, U u> ----? Bi function accepts two Objects (any) and returns one returns ONE object
        // abstract method; R apply ( T t, U u);

        BiFunction <Integer, Integer, Integer> maxNumber = (num1, num2) -> {

            return num1 > num2 ? num1 : num2;

        };

        System.out.println(maxNumber.apply(4, -6));

        System.out.println("--------------------------");

        // make a function that accepts two List and returns a map

        BiFunction <List<Integer>, List<String>, Map<Integer, String>> makeMap = (list1, list2) -> {
            // [1,2,3]
            // ["one", "two"]

            Map <Integer, String> map = new HashMap<>();

            if (list1.size() != list2.size()) {

                throw new RuntimeException("Lists do not have the size size of elements");
            }else {

                for (int i = 0; i < list2.size(); i++) { //
                    // map.put (KEY     ,   VALUE   );
                    map.put(list1.get(i), list2.get(i));

                }


            }

            return map;
        };

        List <Integer> numList = new ArrayList<>(Arrays.asList(1,2,3));
        List <String> strList = new ArrayList<>(Arrays.asList("a","b","c"));

        System.out.println(makeMap.apply(numList, strList));


    }
}
