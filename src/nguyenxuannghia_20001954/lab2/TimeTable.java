package nguyenxuannghia_20001954.lab2;

import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = Integer.parseInt(sc.nextLine());
        String character = "*";

        timeTable(size, character);
    }

    public static void timeTable(int size, String character) {
        for (int row = - 1 ; row <= size ; row++) {
            for (int col = 0 ; col <= size ; col++) {

                if (row == - 1 && col == 0) {
                    System.out.printf("%4s%3s", character, "|");
                } else if (row == 0) {
                    System.out.printf("%4s", "-");
                } else if (row == - 1) {
                    System.out.printf("%4d", (col * (row + 2)));
                } else if (col == 0) {
                    System.out.printf("%4d%3s", ((col + 1) * row), "|");
                } else {
                    System.out.printf("%4d", (col * row));
                }
            }
            System.out.println();
        }
    }
}
