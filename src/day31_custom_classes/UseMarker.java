package day31_custom_classes;

public class UseMarker {
    public static void main(String[] args) {

        // The old way "Default constructor"

//        Marker marker1 = new Marker(); // it's default
//        marker1.type = "Dry color";
//        marker1.brand = "Sharpie";
//        marker1.color = "Black";


        Marker marker1 = new Marker("Dry color", "Sharpie", "Black");

        System.out.println(marker1);
        System.out.println();

        Marker marker2 = new Marker("Oil color", "Expo", "Red");
        System.out.println(marker2);






    }
}
