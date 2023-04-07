package nguyenxuannghia_20001954.lab5.part1.ex2;

public class TestMain {

    public static void main(String[] args) {
        final String RADIUS = "radius is: ";
        final String AREA = "area is: ";
        final String CIRCUMFERENCE = "circumference is: ";

        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        System.out.println(circle2);

        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.printf(RADIUS + "%.2f%n", circle1.getRadius());

        System.out.printf(AREA + "%.2f%n", circle1.getArea());
        System.out.printf(CIRCUMFERENCE + "%.2f%n", circle1.getCircumference());
    }
}
