package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class Reverse {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = inputArray();
        reverse(array);
        printArray(array);
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

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int index = 0 ; index < array.length; index++) {
            if (index == 0) {
                System.out.print("Reverse array: [" + array[index] + ", ");
            } else if (index == array.length - 1) {
                System.out.print(array[index] + "]");
            } else {
                System.out.print(array[index] + ", ");
            }
        }
    }
}
