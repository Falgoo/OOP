package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class Equals {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Create array 1");
        int[] array1 = inputArray();
        System.out.println("Create array 2");
        int[] array2 = inputArray();

        if (equals(array1, array2)) {
            System.out.println("Array 1 equals to array 2");
        } else {
            System.out.println("Array 1 doesn't equals to array 2");
        }
    }

    public static int[] inputArray() {
        System.out.print("Enter the number of elements: ");
        int arrayLength = Integer.parseInt(sc.next());

        System.out.print("Enter the value of all elements (separated by space): ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Integer.parseInt(sc.next());
        }
        return array;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
