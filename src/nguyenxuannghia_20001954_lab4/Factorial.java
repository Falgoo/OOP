package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println(number + "! is: " + factorial(number));
        System.out.println(number + "! with for is: " + factorialWithFor(number));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int factorialWithFor(int number) {
        int factorial = 1;
        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }
        return factorial;
    }
}
