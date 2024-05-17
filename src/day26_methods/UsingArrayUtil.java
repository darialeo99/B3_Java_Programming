package day26_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int [] a = {3, 1, 5, 7, 3, 23};

        System.out.println( ArrayUtil.minNumInArr(a) ) ;

        System.out.println( ArrayUtil.maxNumInArr(a) );

        System.out.println( ArrayUtil.contains(a, 4) ); // returns boolean
        System.out.println( ArrayUtil.contains(a, 3) ); // returns boolean


    }
}
