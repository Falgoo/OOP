package nguyenxuannghia_20001954_homework1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageWithInputValidation {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("average of 3 students is: " +df.format(averageWithInputValidation()));
    }

    public static double averageWithInputValidation() {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[3];

        for (int i = 0; i < students.length; i++) {
            do {
                System.out.print("Enter the mark (0−100) for student " + (i + 1) + " : ");
                students[i] = Integer.parseInt(sc.nextLine());

                if (students[i] <= 0 || students[i] >= 100)
                    System.out.println("Invalid input, try again...");
            } while (students[i] <= 0 || students[i] >= 100);
        }

        double sum = 0;
        for (int student: students) {
            sum += student;
        }
        return sum / students.length;
    }
}
