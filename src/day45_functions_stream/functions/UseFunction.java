package day45_functions_stream.functions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class UseFunction {

    public static void main(String[] args) {

        // <T, R> ---> accepts on eObject Type (T) and returns one Object Type (R)
        Function <int [], List<Integer>> convertArrIntoList = arr -> {
            List <Integer> list = new ArrayList<>();

            for ( int each : arr) {

                list.add(each);

            }

            return list;

        };

        int [] a = {34,32,56,424,2,9,2};
        System.out.println(convertArrIntoList.apply(a));

        // also remove duplicates
        System.out.println(new HashSet<>(convertArrIntoList.apply(a)));

        // also sort

        System.out.println(new TreeSet<>(convertArrIntoList.apply(a)));

    }
}
