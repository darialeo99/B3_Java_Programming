package day24_methods;

public class OurArrayClass {

    public static void arrFirstElem (int[] arr){ // my method will accept array
        System.out.println("First Elements: " + arr[0]);

    }

    public static void arrLastElem (int [] arr){
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void arrMiddElems (int [] arr){
        if(arr.length % 2 == 0){ // if length is even
            System.out.println("Middle first: " + arr[arr.length/2-1]);
            System.out.println("Middle second: " + arr[arr.length/2]);

        }else{
            System.out.println("Middle: " + arr[arr.length/2]);
        }

    }






    public static void main(String[] args) {

        int [] numbers = {10, 2, 4, 765, 23, 0, 2344};
        int [] numbers2 = {1034, 8, 9, 7695, 2356, 6, 23};
        int [] numbers3 = new int[3];

        int [] numbers4 = {10, 2, 4, 90, 23, 0, 2344}; // not even // 7 - > 90 -- > 7/2 -- > 3
        int [] numbers5 = {10, 2, 4, 765, 23, 0, 2344,67};  //  // 8 - > 765, 23 --- > 8/2-1 --- > 3 , 8/2 --- > 4

        arrFirstElem(numbers);
        arrLastElem(numbers);
        System.out.println();
        arrFirstElem(numbers2);
        arrLastElem(numbers2);

        System.out.println();
        arrFirstElem(numbers3);
        arrLastElem(numbers3);

        System.out.println();
        arrMiddElems(numbers4);
        arrMiddElems(numbers5);




    }
}
