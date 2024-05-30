package day31_custom_classes;

public class Address {

    String street;

    String city;

    String state;

    String zipcode;

    // Making constructor
    public Address (String street, String city, String state, String zipcode) {

        this.street = street; // Since LOCAL variable and INSTANCE variables have the same names, Java will prioritize LOCAL variables to make difference between them I used "this" key word
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;


    }


    public void fullClass (){
        System.out.println(street + " " + city + " " + state + " " + zipcode);
    }

}

class Test {
    public static void main(String[] args) {

        Address obj = new Address("123 Test", "Fairfax", "VA", "12345");

        System.out.println(obj.city); // Fairfax

        obj.city = "Falls Church"; // this.city = "Falls Church";
        System.out.println(obj.city);

        obj.fullClass();
        System.out.println(obj.toString()); // no need to input .toString it does it automatically in Java backend
    }
}
