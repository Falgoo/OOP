package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array integer separate by space: ");
        String[] arrayString = sc.nextLine().split(" ");
        System.out.print("Enter key: ");
        int key = Integer.parseInt(sc.nextLine());
        int[] array = convertArrayStringToArrayInt(arrayString);
        System.out.println("Is array contains key: " + contains(array, key));
    }

    public static int[] convertArrayStringToArrayInt(String[] arrayString) {
        if (arrayString[0].equals("")) {
            return new int[0];
        }

        int[] array = new int[arrayString.length];
        for (int index = 0 ; index < arrayString.length ; index++) {
            array[index] = Integer.parseInt(arrayString[index]);
        }
        return array;
    }

    public static boolean contains(int[] array, int key) {
        if (array.length == 0) {
            return false;
        }

        for (int ele : array) {
            if (ele == key) {
                return true;
            }
        }
        return false;
    }
}
