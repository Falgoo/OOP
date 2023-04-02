package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class Search {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = inputArray();
        System.out.print("Enter the key: ");
        int key = Integer.parseInt(sc.next());
        System.out.println("Key index: " + search(array, key));
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

    public static int search(int[] array, int key) {
        for (int index = 0 ; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
