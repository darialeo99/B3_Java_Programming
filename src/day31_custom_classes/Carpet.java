package day31_custom_classes;

public class Carpet {

    // Class is the blueprint (instructions) for the object

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;


    // I want to have a custom constructor

    public Carpet (boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice) {
        //calculatePrice(); // it will be 0 since other values below are still default when we connect CalculatePrice class
        isPersian = inputPersian;
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice(); // will not be 0 since we already assigned values to CalculatePrice already and can count the TotalPrice


    }

    public void calculatePrice () {
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice += 200;
        }
    }

    public String toString (){
        return "Carpet info: "+
                "\nWidth : " + width +
                "\nLength : " + length +
                "\nPersian: " + isPersian +
                "\nUnitPrice " + unitPrice +
                "\nTotal Price: " + totalPrice;

    }

}
