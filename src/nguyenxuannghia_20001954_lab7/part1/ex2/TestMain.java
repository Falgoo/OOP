package nguyenxuannghia_20001954_lab7.part1.ex2;

public class TestMain {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(6, 8);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
