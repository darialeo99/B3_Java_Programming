package day26_methods;

import my_utilities.ArrayUtil;

public class ArrayIndexOf {
    public static void main(String[] args) {

        int [] arr = {12, 3, 5, 73, 13, 2, 5}; // find index of 5
        System.out.println(indexOf(arr, 5));

        String [] arr2 = {"java", "selenium", "api"};

        System.out.println(indexOf(arr2, "api"));
        System.out.println(indexOf(arr2, "java"));

        //System.out.println(ArrayUtil.indexOf(arr2, "selenium"));

        int num = ArrayUtil.indexOf(arr2, "selenium"); // the same as on line 16, but we assign it to the certain variable for ex: int num
        System.out.println(num); // here we are calling this variable to print it

    }


// {12, 3, 5, 73, 13, 2, 5};
    public static int indexOf (int [] arr, int num){


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num){
                return i;
            }

        }

    return  -1;

    }


    // {"java", "selenium", "api"};
    public static int indexOf (String [] array, String word){


        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(word)){
                return i;
            }

        }

        return  -1;

    }


}
