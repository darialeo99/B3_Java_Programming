package day36_inheritance.shapes;

public class Square extends Shape {

    double side;

    public Square ( double side) {
        super("Square");
        this.side = side;


    }

    @Override // Did I override this method correctly from my parent?
    public double area () {

        return side * side;

    }


    @Override
    public double perimeter () {
        return side * 4;
    }

    @Override
    public String toString () {

        return "Info about " + name + ": \nArea " + area() + "\nPerimeter: " + perimeter() + "\nSide: " + side;

    }

}
