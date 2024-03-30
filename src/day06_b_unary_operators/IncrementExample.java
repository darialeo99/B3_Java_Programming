package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);

        x= x + 1; //took the value of x , which is 0 and then added 1 on it ---> x = 0 + 1; ---> x = 1;
        System.out.println(x); //1

        x++; // post increment - increases it by only 1.
        System.out.println(x);//2

        ++x; // pre increment = increases it by only 1.
        System.out.println(x); //3

        System.out.println(++x); // 4 ---> because it is PRE INCREMENT, it will increase it first and print out. It will incased it first and then we use it
                                // x = 4

        System.out.println(x++); // 4 ---> because it is POST INCREMENT, it will be used first and than increment

        System.out.println(x);

    }
}
