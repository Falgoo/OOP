package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        sc.close();

        selectionSort(array);
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

    public static void selectionSort(int[] array) {
        for (int index = 0 ; index < array.length - 1; index++) {
            int minIdx = index;
            for (int indexCompare = index + 1 ; indexCompare < array.length; indexCompare++) {
                if (array[indexCompare] < array[minIdx]) {
                    minIdx = indexCompare;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[index];
            array[index] = temp;
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Selection sort result:");
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
}
