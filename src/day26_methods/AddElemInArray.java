package day26_methods;

import java.util.Arrays;

public class AddElemInArray {
    public static void main(String[] args) {


        int [] a = {1, 2, 3};


        //int [] b = null; // ""

        int [] b = addElemInArr(a, 5);
        System.out.println(Arrays.toString(b));

        System.out.println( Arrays.toString(addElemInArr(b, 943))  );
        System.out.println( Arrays.toString(addElemInArr2(b, 943))  );

    }


    // create a method that accepts int [] array and a number and returns an int array with added element in it.

    public static int [] addElemInArr (int [] origArr, int elemToAdd){

        int [] newArr = Arrays.copyOf(origArr, origArr.length + 1); //creating 1 more additional space in the new copied array
        // {1, 2, 3, _};

        newArr[newArr.length-1] = elemToAdd;



        return newArr;



    }


    // This is doing exactly the same thing above but using fori loop

    public static int [] addElemInArr2 (int [] origArr, int elemToAdd){

        int [] newArr = new int [origArr.length + 1];

        for (int i = 0; i < origArr.length; i++) {

            newArr [i] = origArr[i];

        }

        // {1,2,3, _}

        newArr [newArr.length - 1] = elemToAdd;

        return newArr;



    }
}
