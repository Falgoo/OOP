package nguyenxuannghia_20001954_lab6.part1.ex4;

public class TestMain {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Default shape: "+ shape);
        shape.setColor("yellow");
        System.out.println("Set shape's color to blue: " + shape.getColor());
        shape.setFilled(false);
        System.out.println("Set shape's filled to false: " + shape.isFilled());
        System.out.println("Shape: " + shape);

        Circle circle = new Circle();
        System.out.println("\nDefault circle: " + circle);
        circle.setRadius(5);
        System.out.println("Set circle's radius to 5: " + circle.getRadius());
        circle.setColor("yellow");
        System.out.println("Set circle's color to yellow: " + circle.getColor());
        System.out.println("Circle: " + circle);
        System.out.printf("Circle's area: %.2f\n", circle.getArea());
        System.out.printf("Circle's perimeter: %.2f\n", circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println("\nDefault rectangle: " + rectangle);
        rectangle.setWidth(20);
        System.out.println("Set rectangle's width to 20: " + rectangle.getWidth());
        rectangle.setLength(15);
        System.out.println("Set rectangle's length to 15: " + rectangle.getLength());
        System.out.println("Rectangle: " + rectangle);
        System.out.printf("Rectangle's area: %.2f\n", rectangle.getArea());
        System.out.printf("Rectangle's perimeter: %.2f\n", rectangle.getPerimeter());

        Square square = new Square();
        System.out.println("\nDefault square: " + square);
        square.setSide(8);
        System.out.println("Set square's side to 8: " + square.getSide());
        square.setFilled(false);
        System.out.println("Set square's filled to false: " + square.isFilled());
        System.out.println("Square: " + square);
        System.out.printf("Square's area: %.2f\n", square.getArea());
        System.out.printf("Square's perimeter: %.2f\n", square.getPerimeter());
    }
}
