package nguyenxuannghia_20001954.lab4;

import java.util.Scanner;

public class PrimeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper bound: ");
        int upperBound = Integer.parseInt(sc.nextLine());
        sc.close();

        printPrime(upperBound);
    }

    public static boolean isPrime(int num) {
        for (int index = 2 ; index <= Math.sqrt(num); index++) {
            if (num % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int upperBound) {
        int primeCount = 0;
        System.out.println("Prime list is: ");
        for (int index = 1 ; index <= upperBound; index++) {
            if (isPrime(index)) {
                System.out.print(index + " ");
                primeCount++;
            }
        }
        double primePer = (double) primeCount / upperBound * 100.0;
        System.out.printf("[%d primes found (%.2f%%)]", primeCount, primePer);
    }
}
