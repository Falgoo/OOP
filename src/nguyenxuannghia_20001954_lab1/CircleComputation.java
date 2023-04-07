package nguyenxuannghia_20001954_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleComputation {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        final String DIAMETER = "\nDiameter of circle with radius = " + r + " is: ";
        final String AREA = "Area of circle with radius = " + r + " is: ";
        final String CIRCUMFERENCE = "Circumference of circle with radius = " + r + " is: ";

        double[] circleDiaAreaCircumference = circleComputation(r);

        System.out.println(DIAMETER + df.format(circleDiaAreaCircumference[0]));
        System.out.println(AREA + df.format(circleDiaAreaCircumference[1]));
        System.out.println(CIRCUMFERENCE + df.format(circleDiaAreaCircumference[2]));
    }

    public static double[] circleComputation(double r) {
        double[] circleDiaAreaCircumference = new double[3];

        circleDiaAreaCircumference[0] = 2 * r;
        circleDiaAreaCircumference[1] = Math.PI * r * r;
        circleDiaAreaCircumference[2] = 2 * Math.PI * r;

        return circleDiaAreaCircumference;
    }
}
