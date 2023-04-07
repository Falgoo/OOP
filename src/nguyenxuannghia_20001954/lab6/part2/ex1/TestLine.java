package nguyenxuannghia_20001954.lab6.part2.ex1;

public class TestLine {

    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(3, 4);
        Point p2 = new Point(10, 12);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println("Line's length: " + l1.getLength());
        System.out.println("Line's gradient: " + l1.getGradient());
    }
}
