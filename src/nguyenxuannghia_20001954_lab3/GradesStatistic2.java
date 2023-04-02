package nguyenxuannghia_20001954_lab3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistic2 {

    public static int[] grades;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        readGrades(scan);
        System.out.print("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f\n", averageGrades(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + minGrade(grades));
        System.out.println("The maximum is: " + maxGrade(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }

    public static void readGrades(Scanner scan) {
        System.out.print("Enter the number of students: ");
        int numOfStu = Integer.parseInt(scan.next());
        grades = new int[numOfStu];

        for (int index = 0 ; index < numOfStu; index++) {
            System.out.print("Enter the grade for student " + (index + 1) + ": ");
            grades[index] = Integer.parseInt(scan.next());
        }
    }

    public static void print(int[] grades) {
        for (int index = 0 ; index < grades.length; index++) {
            if (index == 0) {
                System.out.print("[" + grades[index] + ", ");
            } else if (index == grades.length - 1) {
                System.out.println(grades[index] + "]");
            } else {
                System.out.print(grades[index] + ", ");
            }
        }
    }

    public static double averageGrades(int[] gradeStudents) {
        int sum = 0;
        for (int grade : gradeStudents) {
            sum += grade;
        }
        return (double) sum / gradeStudents.length;
    }

    public static double median(int[] grades) {
        double median = 0;

        int[] cloneGrades = grades;
        Arrays.sort(grades);

        if (cloneGrades.length % 2 == 1) {
            median = cloneGrades[cloneGrades.length / 2 - 1];
        } else {
            median =  (double) (cloneGrades[cloneGrades.length / 2 - 1] + cloneGrades[cloneGrades.length / 2]) / 2;
        }
        return median;
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

    public static double stdDev(int[] array) {
        double stdDev;
        double check = 0;
        double mean = averageGrades(array);

        for (int ele : array) {
            check += Math.pow(ele, 2) - Math.pow(mean, 2);
        }
        stdDev = Math.sqrt(check / array.length);

        return stdDev;
    }
}
