package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a and b separate by space: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("Euclid algorithm result: ");
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));

    }

    public static int gcd(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
