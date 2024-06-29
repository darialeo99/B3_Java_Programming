package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList <Integer> base = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2));
        System.out.println(base);

        ArrayList <Integer> nums = new ArrayList<>(base); // made a new arrays and copied all values from base ArrayList to nums ArrayList
                                                            // 4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2

//
//        for (Integer each : nums) {
//            if (each % 2 == 0) {
//                nums.remove(each);
//            }
//        }

        nums.removeIf(each -> each % 2 == 0);  // predicate, lambda exspression . Lamba exps. can only be used with Collections.


        System.out.println(nums);

        ArrayList <Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf(n -> n > 10);
        System.out.println(nums2);

        ArrayList <Integer> nums3 = new ArrayList<>(base);
        nums3.replaceAll(e -> e*2);
        System.out.println(nums3);






    }
}
