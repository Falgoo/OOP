package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class Swap {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Create array 1");
        int[] array1 = inputArray();

        System.out.println("Create array 2");
        int[] array2 = inputArray();

        System.out.println("Is swap " + swap(array1, array2));

        System.out.print("Array 1 after the swap: ");
        printArray(array1);

        System.out.println("Array 2 after the swap: ");
        printArray(array2);
    }

    public static int[] inputArray() {
        System.out.print("Enter the number of elements: ");
        int arrayLength = Integer.parseInt(scan.next());

        System.out.print("Enter the value of all elements (separated by space): ");
        int[] array = new int[arrayLength];
        for (int index = 0 ; index < arrayLength; index++) {
            array[index] = Integer.parseInt(scan.next());
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int index = 0 ; index < array1.length; index++) {
            int temp = array1[index];
            array1[index] = array2[index];
            array2[index] = temp;
        }

        return true;
    }
}
