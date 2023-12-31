package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    @Override
    public double area() {

        return (radius * radius * Math.PI);
    }

    @Override
    public double perimeter() {

        return (2 * Math.PI + radius);
    }
}
