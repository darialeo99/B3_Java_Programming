package day31_custom_classes;

public class UseThisKeyword {
    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(300);

        System.out.println(obj.a);
        //System.out.println(obj);// wil print obj memory location
    }
}
