package nguyenxuannghia_20001954.lab7.part1.ex1;

public class TestMain {

    public static void main(String[] args) {

        Shape shape1 = new Circle("red", false, 5.5);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println(((Circle) shape1).getRadius());
        System.out.println();

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());
        System.out.println();

        Shape shape2 = new Rectangle("red", false, 1.0, 2.0);
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        System.out.println(((Rectangle) shape2).getLength());
        System.out.println();

        Rectangle shape3 = (Rectangle) shape2;
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        System.out.println(shape3.getLength());
        System.out.println();

        Shape shape4 = new Square(6.6);
        System.out.println(((Square) shape4).getSide());
        System.out.println();

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(((Square) rectangle2).getSide());
        System.out.println(rectangle2.getLength());
        System.out.println();

        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
    }
}
