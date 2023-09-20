package day9.Task2;

public class Circle extends Figure {
    private int radius;

    public Circle(double radius, String color) {
        super(color);
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI + radius;
    }
}
