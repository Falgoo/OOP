package nguyenxuannghia_20001954.lab6.part2.ex2;

public class TestMain {

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        printCylinder(cylinder1);

        Cylinder cylinder2 = new Cylinder(10.0);
        printCylinder(cylinder2);

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        printCylinder(cylinder3);
    }

    public static void printCylinder(Cylinder cylinder) {
        System.out.println("Cylinder["
                            + " radius=" + cylinder.getRadius()
                            + ", height=" + cylinder.getHeight()
                            + ", base area=" + cylinder.getArea()
                            + ", volume=" + cylinder.getVolume()
                            + "]");
        System.out.println(cylinder);
    }
}
