package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper bound: ");
        int upperBound = Integer.parseInt(sc.nextLine());
        sc.close();

        printResult(upperBound);
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int index = 1 ; index < aPosInt; index++) {
            if (aPosInt % index == 0 && isPrime(index)) {
                product *= index;
            }
        }
        return (product == aPosInt);
    }

    public static boolean isPrime(int num) {
        for (int index = 2 ; index <= Math.sqrt(num); index++) {
            if (num % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printResult(int upperBound) {
        int countResult = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int index = 1 ; index <= upperBound; index++) {
            if (isProductOfPrimeFactors(index)) {
                System.out.print(index + " ");
                countResult++;
            }
        }
        double countPer = (double) countResult / upperBound * 100.0;
        System.out.printf("\n[%d numbers found (%.2f%%)]", countResult, countPer);
    }
}
