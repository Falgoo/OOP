package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a and b separate by space: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Gcd is: " + gcd(a, b));
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
