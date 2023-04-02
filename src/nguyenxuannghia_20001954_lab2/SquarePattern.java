package nguyenxuannghia_20001954_lab2;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = Integer.parseInt(sc.nextLine());
        String character = "#";

        System.out.println("Square with for loop");
        printSquareForLoop(size, character);
        System.out.println("Square with while loop");
        printSquareWhileLoop(size, character);
    }

    public static void printSquareForLoop(int size, String character) {
        for (int row = 1 ; row <= size ; row++) {
            for (int col = 1 ; col <= size ; col++) {
                if (col == size) {
                    System.out.print(character);
                } else {
                    System.out.print(character + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printSquareWhileLoop(int size, String character) {
        int row = 1;

        while (row <= size) {
            int col = 1;
            while (col <= size) {
                if (col == size) {
                    System.out.print(character);
                } else {
                    System.out.print(character + " ");
                }
                col++;
            }
            if (row != size) {
                System.out.println();
            }
            row++;
        }
    }
}
