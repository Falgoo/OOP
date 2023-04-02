package nguyenxuannghia_20001954_lab2;

import java.util.Scanner;

public class HillPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int rows = Integer.parseInt(sc.nextLine());

        drawUpwardTri(rows);
        System.out.println("(a)\n");

        drawDownwardTri(rows);
        System.out.println("(b)\n");

        drawCombineTri(rows);
        System.out.println("(c)\n");

        drawOppCombineTri(rows);
        System.out.println("(d)");
    }

    //a
    public static void drawUpwardTri(int rows) {
        for (int row = 1 ; row <= rows; row++) {
            int cols = rows * 2 - 1;
            for (int col = 1 ; col <= cols ; col++) {
                if (row + col >= rows + 1 && row >= col - rows + 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //b
    public static void drawDownwardTri(int rows) {
        for (int row = 1 ; row <= rows; row++) {
            int cols = rows * 2 - 1;
            for (int col = 1 ; col <= cols ; col++) {
                if (row + col <= cols + 1 && row <= col) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //c
    public static void drawCombineTri(int rows) {
        for (int row = 1 ; row <= rows ; row++) {
            int cols = rows * 2 - 1;
            for (int col = 1 ; col <= cols ; col++) {
                if (row + col >= rows + 1 && row >= col - rows + 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int row = 2 ; row <= rows ; row++) {
            int cols = rows * 2 - 1;
            for (int col = 1 ; col <= cols ; col++) {
                if (row + col <= cols + 1 && row <= col) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //d
    public static void drawOppCombineTri(int rows) {
        for (int row = 1 ; row <= rows ; row++) {
            int cols = rows * 2 - 1;
            for (int col = 1 ; col <= cols ; col++) {
                if (row + col >= rows + 2 && row >= col - rows + 2) {
                    System.out.print("   ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }

        for (int row = 1 ; row <= rows ; row++) {
            int cols = rows * 2 - 1;
            for (int col = 1 ; col <= cols ; col++) {
                if (row + col <= cols && row <= col - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
