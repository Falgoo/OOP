package nguyenxuannghia_20001954_lab7.part1.ex2;

public class Rectangle implements GeometricObject {

    final private double width;
    final private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[width="
                + width + ", length="
                + length + ']';
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
