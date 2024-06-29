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

        String obj = name;

        if (brand != null){ // if it is not default value
            obj += " - " + brand;
        }

        if (memory != 0){
            obj += " - " + memory;
        }

        if (version != 0.0){
            obj += " - " + version;
        }

//        return "Phone{" +
//                "name='" + name + '\'' +
//                ", brand='" + brand + '\'' +
//                ", memory=" + memory +
//                ", version=" + version +
//                '}';

        return  obj;
    }
}
