package nguyenxuannghia_20001954.lab6.part1.ex4;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "[Shape[Rectangle[" +
                "color='" + this.getColor() + '\'' +
                ", filled=" + this.isFilled() +
                "], width=" + this.width +
                ", length=" + this.length +
                ']';
    }
}
