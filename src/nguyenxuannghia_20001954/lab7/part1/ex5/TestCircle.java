package nguyenxuannghia_20001954.lab7.part1.ex5;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle: " + circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println();

        ResizableCircle resizableCircle = new ResizableCircle(20);
        System.out.println("Resizable circle: " + resizableCircle);
        resizableCircle.resize(10);
        System.out.println("After resizing: " + resizableCircle);
        System.out.println("Perimeter after resizing: " + resizableCircle.getPerimeter());
        System.out.println("Area after resizing: " + resizableCircle.getArea());
    }
}
