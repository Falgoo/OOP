package nguyenxuannghia_20001954_lab5.part2.ex10;

public class TestMain {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(-4, 4);
        MyPoint point2 = new MyPoint(4, -4);
        MyRectangle rectangle = new MyRectangle(point1, point2);
        System.out.println(rectangle);

        System.out.println("perimeter is: " + rectangle.getPerimeter());
        System.out.println("area is: " + rectangle.getArea());
    }
}
