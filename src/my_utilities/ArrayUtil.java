package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method returns the min number from array using sorted method
     * @param arr is the parameter that accepts array
     * @return the minimum number among all the number from array
     */

    public static int minNumInSortedArr (int [] arr){

        Arrays.sort(arr);
        return arr[0];
    }




    /**
     * This method returns the min number from array using fori loop
     * @param arr is the parameter that accepts array
     * @return the minimum number among all the number from array
     */

    public static int minNumInArr (int [] arr){

        int min = arr [0];

        for ( int eachNum : arr){
            if (eachNum < min){
                min = eachNum;
            }
        }

        return  min;
    }



    /**
     * This method returns the max number from array using sorted method
     * @param arr is the parameter that accepts array
     * @return the maximum number among all the number from array
     */

    public static int maxNumInSortedArr (int [] arr){

        Arrays.sort(arr);
        return arr[arr.length-1];
    }





    /**
     * This method returns the min number from array using fori loop
     * @param arr is the parameter that accepts array
     * @return the minimum number among all the number from array
     */

    public static int maxNumInArr (int [] arr){

        int max = arr [0];

        for ( int eachNum : arr){
            if (eachNum > max){
                max = eachNum;
            }
        }

        return  max;
    }






    /**
     * This method checks if a given number exists in the array
     * @param arr if the given array to be checked
     * @param num is the given number to check if it exists in array
     * @return boolean if given num exists in array or not.
     */


    public static boolean contains (int [] arr, int num){

        //boolean result = false;

        for (int eachNum : arr){
            if (eachNum == num){
                return true;

            }
        }

        return false;
    }
}
