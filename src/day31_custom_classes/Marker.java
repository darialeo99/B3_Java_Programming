package day31_custom_classes;

public class Marker {

    // 3 instance variables
    String type;
    String brand;
    String color;

    // Creating my own Constructor

    // Once we have custom Constructor, there is NO MORE default constructor
    public Marker (String inputType, String inputBrand, String inputColor){

        type = inputType;
        brand = inputBrand;
        color = inputColor;


    }

    @Override
    public String toString() {
        return "Marker: " +
                "\ntype: " + type  +
                "\nbrand: " + brand  +
                "\ncolor: " + color;
    }
}
