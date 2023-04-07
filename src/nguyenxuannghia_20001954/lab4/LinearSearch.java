package nguyenxuannghia_20001954.lab4;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);

        System.out.print("enter key: ");
        int key = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.print("Is key exist in array: " + linearSearch(array, key));
        System.out.println("\nIndex of key in array: " + linearSearchIndex(array, key));
    }

    public static int[] inputArray(Scanner sc) {
        System.out.print("Enter size of array: ");
        int size = Integer.parseInt(sc.nextLine());

        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter element " + (index + 1) + " in array ");
            array[index] = Integer.parseInt(sc.nextLine());
        }
        return array;
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int ele: array) {
            if (ele == key) {
                return true;
            }
        }
        return  false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index + 1;
            }
        }
        return 0;
    }
}
