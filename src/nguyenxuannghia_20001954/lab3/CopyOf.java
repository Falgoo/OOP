package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class CopyOf {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = inputArray();
        int[] copyArray = copyOf(array);
        System.out.println("ArrayCopy: ");
        printArray(copyArray);

        System.out.println("Copy array with required length");
        int[] array2 = inputArray();

        System.out.print("Enter the number of copied array's required length: ");
        int newLength = Integer.parseInt(sc.next());
        int[] copyArray2 = copyOf(array2, newLength);
        printArray(copyArray2);
    }

    public static void printArray(int[] array) {
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int[] inputArray() {
        System.out.print("Enter the number of elements: ");
        int arrayLength = Integer.parseInt(sc.next());

        System.out.print("Enter the value of all elements (separated by space): ");
        int[] array = new int[arrayLength];
        for (int index = 0 ; index < arrayLength; index++) {
            array[index] = Integer.parseInt(sc.next());
        }
        return array;
    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];

        for (int index = 0 ; index < array.length; index++) {
            copyArray[index] = array[index];
        }
        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] result = new int[newLength];

        for (int index = 0 ; index < result.length; index++) {
            if (index < array.length) {
                result[index] = array[index];
            } else {
                result[index] = 0;
            }
        }
        return result;
    }
}
