package day31_custom_classes;

public class Phone {

    String name;
    String brand;
    int memory;
    double version;

    public Phone (String name) { // name = "Iphone X"
        this.name = name; // phone.name = name;
        //name = name; // phone.name = name; ---> name = "Iphone X"




    }


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }
}
