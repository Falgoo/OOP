package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base ");
        int base = Integer.parseInt(sc.nextLine());
        System.out.print("Enter exponent ");
        int exponent = Integer.parseInt(sc.nextLine());
        printValue(base, exponent);
    }

    public static int exponent(int base, int exp) {
        int value = 1;

        if (exp == 0) {
            return 1;
        }

        for (int e = 1; e <= exp; e++) {
            value = value * base;
        }
        return value;
    }

    public static void printValue(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Exponent >= 0 not < 0");
        } else {
            int valueAfterExponent = exponent(base, exponent);
            System.out.print(base + " raises to the power " + exponent + " is: " + valueAfterExponent);
        }
    }
}
