package NguyenXuanNghia_20001954_homework1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CylinderComputation {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        System.out.print("Enter radius and height of cylinder: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();

        final String MESSAGE_BASE_A = "Base area of cylinder with radius = " + radius;
        final String MESSAGE_SURFACE_A = "Surface area of cylinder with radius = " + radius;
        final String MESSAGE_VOLUME = "Volume of cylinder with radius = " + radius;
        final String MESSAGE_HEIGHT = " and height = " + height + " is: " ;

        double[] cylinderBaseASurfaceAVolume = cylinderComputation(radius, height);

        System.out.println(MESSAGE_BASE_A  + MESSAGE_HEIGHT + df.format(cylinderBaseASurfaceAVolume[0]));
        System.out.println(MESSAGE_SURFACE_A  + MESSAGE_HEIGHT + df.format(cylinderBaseASurfaceAVolume[1]));
        System.out.println(MESSAGE_VOLUME + MESSAGE_HEIGHT + df.format(cylinderBaseASurfaceAVolume[2]));
    }

    public static double[] cylinderComputation(double r, double h) {
        double[] cylinderBaseASurfaceAVolume = new double[3];

        cylinderBaseASurfaceAVolume[0] = Math.PI * r * r;
        cylinderBaseASurfaceAVolume[1] = 2 * Math.PI * r + 2 * cylinderBaseASurfaceAVolume[0];
        cylinderBaseASurfaceAVolume[2] = cylinderBaseASurfaceAVolume[0] * cylinderBaseASurfaceAVolume[1];

        return cylinderBaseASurfaceAVolume;
    }
}
