package day36_inheritance.taxi;

public class CarRider {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft("Tom");
        //obj1.driver = "Tom";
        System.out.println(obj1.calculateRate(10));

        LyftXL obj2 = new LyftXL("Mikcy");
        System.out.println(obj2.calculateRate(10));


    }
}
