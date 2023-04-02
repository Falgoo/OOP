package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.println(number + " fibonacci is: " + fibonacci(number));
    }

    public static int fibonacci(int number) {
        if (number ==0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
