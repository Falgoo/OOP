package nguyenxuannghia_20001954_lab6.part1.ex3;

public class TestMain {

    public static void main(String[] args) {

        Point2D point2D1 = new Point2D();
        System.out.println("\nDefault 2D point: " + point2D1);
        point2D1.setXY(10, 20);
        System.out.println("Set 2D point X value to 10: " + point2D1.getX());
        System.out.println("Set 2D point Y value to 20: " + point2D1.getY());

        Point2D point2D2 = new Point2D(5, 5);
        System.out.println("2D point: " + point2D2);

        Point3D point3D = new Point3D();
        System.out.println("\nDefault 3D point: " + point3D);
        point3D.setXYZ(6, 6, 6);
        System.out.println("Set 3D point X value to 6: " + point3D.getX());
        System.out.println("Set 3D point Y value to 6: " + point3D.getY());
        System.out.println("Set 3D point Z value to 6: " + point3D.getZ());
        System.out.println("3D point: " + point3D);

        Point3D point3D1 = new Point3D(3.6f, 5.2f, 10.1f);
        System.out.println(point3D1);
    }
}
