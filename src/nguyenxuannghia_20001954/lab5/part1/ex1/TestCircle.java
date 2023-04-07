package nguyenxuannghia_20001954.lab5.part1.ex1;

public class TestCircle {

    public static void main(String[] args) {
        final String RADIUS = "The circle has radius of ";
        final String AREA = " and area of ";
        final String COLOR = "Color of the circle has radius of ";

        Circle circle1 = new Circle();
        System.out.println(RADIUS + circle1.getRadius() + AREA + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println(RADIUS + circle2.getRadius() + AREA + circle2.getArea());

        Circle circle3 = new Circle(2.0, "blue");
        System.out.println(COLOR + circle3.getRadius() + " is " + circle3.getColor());

        System.out.println("========= after set radius and color============");
        circle3.setRadius(5.5);
        System.out.println(RADIUS + circle3.getRadius() + AREA + circle3.getArea());
        circle3.setColor("yellow");
        System.out.println(COLOR + circle3.getRadius() + " is " + circle3.getColor());

        System.out.println("Use toString:");
        System.out.println(circle3.toString());
    }
}
