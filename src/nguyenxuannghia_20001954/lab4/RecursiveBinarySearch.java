package nguyenxuannghia_20001954.lab4;

import java.util.Scanner;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        System.out.print("Enter key: ");
        int key = Integer.parseInt(sc.nextLine());
        sc.close();

        printArray(array, key);
    }

    public static int[] inputArray(Scanner sc) {
        System.out.print("Enter size of array ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + " in array increase ");
            array[index] = Integer.parseInt(sc.nextLine());
        }
        return array;
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            return key == array[fromIdx];
        } else {
            int midIdx = (fromIdx + toIdx) / 2;
            if (key == array[midIdx]) {
                return true;
            } else if (key < array[midIdx]) {
                toIdx = midIdx;
            } else {
                fromIdx = midIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static void printArray(int[] array, int key) {
        System.out.println("Search " + key + " in the entire array using binary search");
        if (binarySearch(array, key)) {
            System.out.println(key + " is in the array");
        } else {
            System.out.println(key + " isn't in the array");
        }
    }
}
