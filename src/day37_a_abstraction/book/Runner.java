package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {

        //Create obj = new Create(); // can not create obj of Interface

        Book ob2 = new Book();
        ob2.read();
        ob2.write();
        System.out.println(ob2.NAME); // will print Test


    }
}
