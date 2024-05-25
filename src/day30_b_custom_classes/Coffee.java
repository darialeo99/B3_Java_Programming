package day30_b_custom_classes;

public class Coffee {

    double price;
    double size;
    String brand;
    String type;


    public String toString (){
        return "Coffee: " +
                "\n\tprice: $" + price +
                "\n\tsize: " + size +
                "\n\tbrand: " + brand +
                "\n\ttype: " + type;
    }

    public void drink (){
        System.out.println("Drinking " + type + " of coffee");

    }

    public void refill (double num){
        System.out.println("Refilling " + num + " oz");
        size += num;
    }


}
