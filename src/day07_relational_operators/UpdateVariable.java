package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        int a = 10;
        a = 11; // re-assigned a new value to a
        a++; // re-assigning [a = a + 1;] ...> re-assigned a new value which increased by 1 [post increment]
        ++a;  // re-assigning [a = a + 1;] ...> re-assigned a new value which increased by 1 [pre increment]
        a = a + 1; // re-assigning [a = a + 1;] ...> re-assigned a new value which increased by 1 [regular adding 1]



        // add 10
        a = a + 10; // re-assigned a new value which increased by 10 [regular adding 10]
        a += 10;    // re-assigned a new value which increased by 10 [shorthand operator]
        System.out.println(a);

        int b = 2;
        b*= 6; // b = b * 6; ---> b = 2 * 6; --- b = 12;
        System.out.println(b); // 12

        int c = 10;
        c %=3; // c = c % 3; ---> c = 10 % 3; ----> c = 1;
        System.out.println(c);

    }
}
