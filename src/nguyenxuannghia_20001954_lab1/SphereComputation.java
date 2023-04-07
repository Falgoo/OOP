package nguyenxuannghia_20001954_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereComputation {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        System.out.print("Enter radius of sphere: ");
        double r = Double.parseDouble(sc.nextLine());
        final String SURFACE_AREA = "\nSurface area of sphere is with radius = " + r + " is: ";
        final String VOLUME = "Volume of sphere is with radius = " + r + " is: ";

        double[] sphereSurfaceAreaVolume = sphereComputation(r);

        System.out.println(SURFACE_AREA + df.format(sphereSurfaceAreaVolume[0]));
        System.out.println(VOLUME + df.format(sphereSurfaceAreaVolume[1]));
    }

    public static double[] sphereComputation(double r) {
        double[] sphereSurfaceAreaVolume = new double[2];

        sphereSurfaceAreaVolume[0] = 4 * Math.PI * r * r;
        sphereSurfaceAreaVolume[1] = (double) 4 / 3 * Math.PI * Math.pow(r,3);

        return sphereSurfaceAreaVolume;
    }
}
