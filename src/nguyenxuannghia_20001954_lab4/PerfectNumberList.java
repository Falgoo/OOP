package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class PerfectNumberList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive int: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.print("Is number " + number + " perfect number: " + isPerfect(number));
        System.out.print("\nIs number " + number + " deficient number: " + isDeficient(number));
        System.out.print("\nEnter upper bound: ");
        int upperBound = Integer.parseInt(sc.nextLine());
        sc.close();

        printPerfect(upperBound);
        printNeitherDeficientNorPerfect(upperBound);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int ele = 1; ele <= aPosInt / 2 + 1; ele++) {
            if (aPosInt % ele == 0) {
                sum += ele;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int ele = 1; ele <= aPosInt / 2 + 1; ele++) {
            if (aPosInt % ele == 0) {
                sum += ele;
            }
        }
        return sum < aPosInt;
    }

    public static void printPerfect(int upperBound) {
        int perfectNumCount = 0;

        System.out.println("\nThese numbers are perfect: ");
        for (int index = 1 ; index <= upperBound; index++) {
            if (isPerfect(index)) {
                System.out.print(index + " ");
                perfectNumCount++;
            }
        }
        double perfectNumCountPer =  (double) perfectNumCount / upperBound * 100.0;
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]", perfectNumCount, perfectNumCountPer);
    }

    public static void printNeitherDeficientNorPerfect(int upperBound) {
        int deficientNorPerfectCount = 0;

        System.out.println("\n\nThese numbers are neither deficient nor perfect: ");
        for (int index = 1 ; index <= upperBound; index++) {
            if (!isPerfect(index) && !isDeficient(index)) {
                System.out.print(index + " ");
                deficientNorPerfectCount++;
            }
        }
        double deficientNorPerfectPer = (double) deficientNorPerfectCount / upperBound * 100.0;
        System.out.printf("\n[%d numbers found (%.2f%%)]", deficientNorPerfectCount, deficientNorPerfectPer);
    }
}
