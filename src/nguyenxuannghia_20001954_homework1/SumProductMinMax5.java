package nguyenxuannghia_20001954_homework1;

import java.util.Scanner;

public class SumProductMinMax5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter n number to calculate: ");
        int numInteger = Integer.parseInt(sc.nextLine());

        int[] listInput = readInput(numInteger);

        System.out.println("\nThe sum is: " + sum(listInput));
        System.out.println("The product is: " + product(listInput));
        System.out.println("The min is: " + min(listInput));
        System.out.println("The max is: " + max(listInput));
    }

    public static int[] readInput(int numsNumber) {
        int[] listInteger = new int[numsNumber];
        for (int num = 1; num <= numsNumber; num++) {
            System.out.print("Enter " + num + " integer: ");
            listInteger[num - 1] = Integer.parseInt(sc.nextLine());
        }
        return listInteger;
    }

    public static int sum(int[] listInteger) {
        int sum = 0;

        for(int integer: listInteger) {
            sum += integer;
        }
        return sum;
    }

    public static int product(int[] listInteger) {
        int product = 1;

        for(int integer: listInteger) {
            product *= integer;
        }
        return product;
    }

    public static int min(int[] listInteger) {
        int min = listInteger[1];

        for(int integer: listInteger) {
            min = Math.min(integer, min);
        }
        return min;
    }

    public static int max(int[] listInteger) {
        int max = listInteger[1];

        for(int integer: listInteger) {
            max = Math.max(integer, max);
        }
        return max;
    }


}
