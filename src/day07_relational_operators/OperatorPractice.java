package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {
        int b = 10;
        b++; // b + b + 1; -- post increment, just stand alone statement value by 1.
        System.out.println(b); // 1 action: print the value of b
        b--; /// b = b -1; -- post decrement, just stand alone statement to decrease value by 1.
        System.out.println(b); // 1 action print value of b

        System.out.println(b++); // 2 actions: print / use it first and update
                                // 1st - use it -- > b = 10
                                // 2nd - update --> b = 11
        System.out.println(b--); // 11 ---- > b = 11 - 1 = 10;
        // 1st --> 11
        //2nd --> 10

        System.out.println(b); // 10

    }
}
