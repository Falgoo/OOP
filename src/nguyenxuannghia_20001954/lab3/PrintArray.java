package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array separate by a space: ");
        String[] arrayInput = sc.nextLine().split(" ");
        int[] array = convertStringArrayToIntArray(arrayInput);
        printArray(array);
    }

    public static int[] convertStringArrayToIntArray(String[] arrayString) {
        int[] array = new int[arrayString.length];
        for (int index = 0; index < arrayString.length; index++) {
            array[index] = Integer.parseInt(arrayString[index]);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.print(array[index] + "]");
            } else {
                System.out.print(array[index] + ", ");
            }
        }
    }
}
