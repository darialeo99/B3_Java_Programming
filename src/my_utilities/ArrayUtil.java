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




    /**
     * This method returns new array with added element at the end
     * @param origArr is an array where we will add an element to the end
     * @param elemToAdd is the element we will add to the end
     * @return new array with added element
     */


    public static int [] addElemInArr (int [] origArr, int elemToAdd){

        int [] newArr = Arrays.copyOf(origArr, origArr.length + 1); //creating 1 more additional space in the new copied array
        // {1, 2, 3, _};

        newArr[newArr.length-1] = elemToAdd;



        return newArr;



    }


    /**
     * This method returns new int array with combined elements from two int arrays
     * @param arr1 is an array whee we will add an element to the beginning
     * @param arr2 is an array where we will add an element to the end
     * @return new array with combined elements
     */
    
    public static int [] addElemInArr(int [] arr1, int [] arr2){ // [0,1,2,3] - [4,5]
        
        int [] newArr = Arrays.copyOf(arr1,arr1.length+arr2.length ); // [0,1,2,3, _, _]

        for (int i = arr1.length; i < newArr.length; i++) {

            newArr[i] = arr2[i - arr1.length]; //newArr [5] == arr2[5 -5];| newArr[6] = arr2[6-5];
            
        }

        return newArr;
    }


    //TODO: create a reusable method with String array (combine two String arrays)



    /**
     * This methods finds the first matched element's index of int array
     * @param arr is the parameter where we will check for the element
     * @param num is the parameter where we will check if there is a match to it
     * @return the index if there is a match and -1 if there is no match.
     */



    public static int indexOf (int [] arr, int num){


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num){
                return i;
            }

        }

        return  -1;

    }


    /**
     * This methods finds the first matched element's index of String array
     * @param array is the parameter where we will check for the element
     * @param word is the parameter where we will check if there is a match to it
     * @return the index if there is a match and -1 if there is no match.
     */


    public static int indexOf (String [] array, String word){


        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(word)){
                return i;
            }

        }

        return  -1;

    }



    /**
     * This method sums up all elements in int array
     * @param nums is the array where I get all the elements to sum up
     * @return the total of the all elements summed up.
     */
    public static int sum (int ... nums){ // ... --> var args , will be accepting these parameters as int array

        int sum = 0;

        for (int each : nums){
            sum += each;

        }

        return sum;
    }


}
