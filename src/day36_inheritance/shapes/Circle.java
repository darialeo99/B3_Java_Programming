package day36_inheritance.shapes;

public class Circle extends Shape {

    /*
    default constructor in the background that we do nt see

    public Circle () {
        super();
    }
     */

    double radius;

    public Circle (double radius) {
        super("Circle");
        this.radius = radius;
    }


    @Override
    public double area () {


        return radius * radius * Math.PI; // 3.14

    }

    @Override
    public double perimeter () {
        return 2 * radius * 3.14;
    }

    //toString method
    @Override
    public String toString () {

        return "Info about " + name + ": \nArea " + area() + "\nPerimeter: " + perimeter();

    }



}
