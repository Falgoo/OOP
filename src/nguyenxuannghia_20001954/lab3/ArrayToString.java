package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class ArrayToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array separate by space: ");
        String[] arrayString = sc.nextLine().split(" ");
        int[] array = convertArrayStringToArrayInt(arrayString);
        System.out.println(arrayToString(array));
    }

    public static int[] convertArrayStringToArrayInt(String[] arrayString) {
        if (arrayString[0].equals("")) {
            return new int[0];
        }

        int[] array = new int[arrayString.length];
        for (int index = 0; index < arrayString.length; index++) {
            array[index] = Integer.parseInt(arrayString[index]);
        }
        return array;
    }

    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "[]";
        }

        String print = "[";
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                print += array[index] + "]";
            } else {
                print += array[index] + ", ";
            }
        }
        return print;
    }
}
