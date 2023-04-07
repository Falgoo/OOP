package nguyenxuannghia_20001954.lab2;

import java.util.Scanner;

public class TriangularPatternX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scan.next());

        drawBotLeftTri(size);
        System.out.println("(a)");

        drawTopLeftTri(size);
        System.out.println("(b)");

        drawTopRightTri(size);
        System.out.println("(c)");

        drawBotRightTri(size);
        System.out.println("(d)");
    }

    public static void drawBotLeftTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTopLeftTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTopRightTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row > col) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void drawBotRightTri(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row + col >= size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
