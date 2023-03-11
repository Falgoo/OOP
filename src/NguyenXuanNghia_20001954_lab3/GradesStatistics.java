package NguyenXuanNghia_20001954_lab3;

import java.util.Scanner;

public class GradesStatistics {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number students: ");
        int numStudents = Integer.parseInt(sc.nextLine());
        int[] gradeStudents = enterGradesStudents(numStudents);

        System.out.println("Average is: " + averageGrades(gradeStudents));
        System.out.println("Maximum grade is: " + maxGrade(gradeStudents));
        System.out.println("Min grade is: " + minGrade(gradeStudents));
    }

    public static int[] enterGradesStudents(int numStudent) {
        int[] gradeStudents = new int[numStudent];

        for (int student = 0; student < numStudent; student++) {
            System.out.print("Enter grade of student " + (student + 1) + " : ");
            gradeStudents[student] = Integer.parseInt(sc.nextLine());
        }
        return gradeStudents;
    }

    public static double averageGrades(int[] gradeStudents) {
        int sum = 0;
        for (int grade : gradeStudents) {
            sum += grade;
        }
        return (double) sum / gradeStudents.length;
    }

    public static int maxGrade(int[] gradeStudents) {
        int max = gradeStudents[0];
        for (int grade : gradeStudents) {
            if (max < grade) {
                max = grade;
            }
        }
        return max;
    }

    public static int minGrade(int[] gradeStudents) {
        int min = gradeStudents[0];
        for (int grade : gradeStudents) {
            if (min > grade) {
                min = grade;
            }
        }
        return min;
    }
}
