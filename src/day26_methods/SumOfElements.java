package day26_methods;

public class SumOfElements {

    public static void main(String[] args) {

        int [] arr = {1, 3, 4, 5, 7};
        System.out.println(sum(arr));

        System.out.println(sum(new int [] {1,2,3,100,56}));
        System.out.println(sum(new int [] {1,2,3,100,5336}));


        System.out.println(sum(2,3,234,90,12)); // passing this array directly

        System.out.println(sum(arr));

        //sum()

        System.out.println(contains(2, 2,3,234,90,12,2,4,78));
        System.out.println(contains(20, 2,3,234,90,12,2,4,78));

    }

    public static boolean contains ( int num, int ... arr){

        //boolean result = false;

        for (int eachNum : arr){
            if (eachNum == num){
                return true;

            }
        }

        return false;
    }

    // create a method that accepts int array and sums up all the elements in the array and returns that total
    // this is with NORMAL version accepting array

//    public static int sum (int [] nums){
//
//        int sum = 0;
//
//        for (int each : nums){
//            sum += each;
//
//        }
//
//        return sum;
//    }




    // create a method that accepts int array and sums up all the elements in the array and returns that total
    // with the help of va -args - ONLY FOR ARRAY!

    public static int sum (int ... nums){ // ... --> var args , will be accepting these parameters as int array

        int sum = 0;

        for (int each : nums){
            sum += each;

        }

        return sum;
    }


    public static void sum (String ... word){ // ... --> var args , will be accepting these parameters as int array


        for (String each : word){
            System.out.println(each);

        }

    }


}
