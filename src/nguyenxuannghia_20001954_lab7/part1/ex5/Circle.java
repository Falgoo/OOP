package nguyenxuannghia_20001954_lab7.part1.ex5;

import nguyenxuannghia_20001954_lab7.part1.ex2.GeometricObject;

public class Circle implements GeometricObject {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle["
                + "radius="
                + radius + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
