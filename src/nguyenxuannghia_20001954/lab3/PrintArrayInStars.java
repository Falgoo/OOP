package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class PrintArrayInStars {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of item number >= 0: ");
        int numberItems = Integer.parseInt(sc.nextLine());
        int[] array = createArray(numberItems);
        String character = "*";

        printArray(array, character);
    }

    public static int[] createArray(int numberItem) {
        System.out.print("Enter " + numberItem + " elements in array, element >= 0: ");
        String[] arrayString = sc.nextLine().split(" ");

        int[] array = new int[numberItem];
        for (int index = 0; index < numberItem; index++) {
            array[index] = Integer.parseInt(arrayString[index]);
        }
        return array;
    }

    public static void printArray(int[] array, String character) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(index + ": ");
            for (int posi = 0; posi < array[index]; posi++) {
                System.out.print(character);
            }
            System.out.println("(" + array[index] + ")");
        }
    }

}
