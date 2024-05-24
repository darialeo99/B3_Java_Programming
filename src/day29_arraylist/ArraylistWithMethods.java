package day29_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistWithMethods {
    public static void main(String[] args) {

        System.out.println(getDaysOfWeek());

        ArrayList <String> weekDays = getDaysOfWeek();
        System.out.println(weekDays.get(0)); // Monday

        System.out.println(printList(weekDays));
        System.out.println("----------------");

        System.out.println(printList(getDaysOfWeek() ));

        System.out.println("---------------------");

        ArrayList <String> list2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printList(list2));

//        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4));
//        System.out.println(printList(nums));

    }



    public static String printList(ArrayList<String> list){

        // Return in specific format

        /*
              LIST:
                    Monday
                    Tuesday
                    ......
         */

        String result = "LIST:";
        for (String each : list){
            result += "\n\t" + each;
        }

        return result;
    }




    // Feruz will check on it

//    public static String printList(ArrayList<Integer> list){
//
//        // Return in specific format
//
//        /*
//              LIST:
//                    Monday
//                    Tuesday
//                    ......
//         */
//
//        String result = "LIST:";
//        for (Integer each : list){
//            result += "\n\t" + each;
//        }
//
//        return result;
//    }





    public static ArrayList<String> getDaysOfWeek(){

        ArrayList <String> weekDays = new ArrayList<>(Arrays.asList(

                "Monday",
                "Tuesday",
                "Wednesday",
                "Friday",
                "Sat",
                "Sun"
        ));

        return weekDays;

    }
}
