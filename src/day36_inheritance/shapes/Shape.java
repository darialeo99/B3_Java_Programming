package day36_inheritance.shapes;

public class Shape {

    String name;

    // making custom constructor
    public Shape(String name) {
        this.name = name;


    }

    // This is an area method - general method
    public double area () {
        return 0.0;

    }

    public double perimeter () {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
