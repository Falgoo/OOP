package NguyenXuanNghia_20001954_homework1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PensionContributionCalculator {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        final String MSG_EMPLOYEE_CONTRIBUTION = "The employee's contribution is: $";
        final String MSG_EMPLOYER_CONTRIBUTION = "The employer's contribution is: $";
        final String MSG_TOTAL_CONTRIBUTION = "The total contribution is: $";

        System.out.print("Enter the monthly salary: $");
        double monthlySalary = Double.parseDouble(sc.nextLine());

        System.out.print("\nEnter the age: ");
        int age = Integer.parseInt(sc.nextLine());

        double[] employeeEmployerTotalContri = pensionContributionCalculator(monthlySalary, age);

        System.out.println(MSG_EMPLOYEE_CONTRIBUTION + df.format(employeeEmployerTotalContri[0]));
        System.out.println(MSG_EMPLOYER_CONTRIBUTION + df.format(employeeEmployerTotalContri[1]));
        System.out.println(MSG_TOTAL_CONTRIBUTION + df.format(employeeEmployerTotalContri[2]));
    }

    public static double[] pensionContributionCalculator(double salary, int age) {
        final double CEIL_SALARY = 6000;
        double[] employeeEmployerTotalContri = new double[3];
        double[][] rateTabulated = {{55, 20, 17},
                                    {60, 13, 13},
                                    {65, 7.5, 9},
                                    {Double.POSITIVE_INFINITY, 5, 7.5}};

        if (salary > CEIL_SALARY) salary = CEIL_SALARY;

        for (int i = 0; i <= rateTabulated[0].length; i++) {
            if (age <= rateTabulated[i][0]) {
                employeeEmployerTotalContri[0] = salary * rateTabulated[i][1] / 100;
                employeeEmployerTotalContri[1] = salary * rateTabulated[i][2] / 100;
                break;
            }
        }
        employeeEmployerTotalContri[2] = employeeEmployerTotalContri[0] + employeeEmployerTotalContri[1];
        return employeeEmployerTotalContri;
    }
}
