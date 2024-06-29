package day22_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};

        //int max = Integer.MIN_VALUE;  // This way you can also get what the MIN value that int can hold
        //int min = Integer.MAX_VALUE;  // This way you can also get what the MAX value that int can hold

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int each : nums){

            if (each > max){
                max = each;

            }

            if (each< min){
                min = each;

            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);



    }
}
