package day34_b_encapsulation;

public class UseSqaure {
    public static void main(String[] args) {

        Square obj = new Square(-5);
        //obj.side = 5; // since side variable is private, can not access directly

        System.out.println( obj. getSide() ); // 0 | 5

        obj.setSide(11);
        System.out.println( obj. getSide() );

        System.out.println(obj); // will call toString method when we print the obj , line 77 in a blueprint file



    }
}
