package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        sc.close();

        insertionSort(array);
        printArray(array);
    }

    public static int[] inputArray(Scanner sc) {
        System.out.print("Enter size of array ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + " in array ");
            array[index] = Integer.parseInt(sc.nextLine());
        }
        return array;
    }

    public static void insertionSort(int[] array) {
        for (int fIdx = 1; fIdx < array.length; fIdx++) {
            int key = array[fIdx];
            int bIdx = fIdx - 1;
            while (bIdx >= 0 && array[bIdx] > key) {
                array[bIdx + 1] = array[bIdx];
                bIdx--;
            }
            array[bIdx + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Selection sort result:");
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
}
