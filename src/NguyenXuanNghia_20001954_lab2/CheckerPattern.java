package NguyenXuanNghia_20001954_lab2;

import java.util.Scanner;

public class CheckerPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = Integer.parseInt(sc.nextLine());
        String character = "#";

        checkerPattern(size, character);
    }

    public static void checkerPattern(int size, String character) {
        for (int row = 1; row <= size; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            for (int col = 1; col <= size; col++) {
                if (col == size) {
                    System.out.print(character);
                } else {
                    System.out.print(character + " ");
                }
            }

            if (row != size) {
                System.out.println();
            }
        }
    }
}
