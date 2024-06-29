package day24_methods;
/*

    count up to a certain number
    start from 0
    all the numbers until the number input

    method(5) --> 0 1 2 3 4 5

    method(10) --> 0 1 2 3 ... 10

 */
public class CountNumbers {  // custom method
    public static void count(int num){

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }




    public static void main(String[] args) {

        count(5);
        count(10);
        count(-10); // false since 0 is not less than -10. it will print empty line since we have it in loop
        count(25);

    }

}
