package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        //
        int a = 0;

        do{
            System.out.println(a);  // 0 1 2 3 4 5                                    // will execute at least one time even if the condition is false
            a++; //1  2  3 4 5 6
        } while (a <= 5 );


        System.out.println("--------------------------------");

        // this is DO WHILE loop: which executes the code block first and then checks the condition for the next interation

        int a2 = 0;

        do {
            System.out.println(a2); // 0 5 10 15
            a2 += 5; // 5 10 15 20
        } while (a2 <= 15);

        System.out.println("--------------------------------");

        // this is DO WHILE loop: which executes the code block first and then checks the condition for the next interation

        int a3 = 0;

        do {
            System.out.println(a3);
        } while (a3 == 10);                         // will execute at least one time even if the condition is false



        // this is a while loop: which checks condition first and based on the result, it executes the code block
        while (a3 == 10){
            System.out.println(a3);
        }


    }
}
