package NguyenXuanNghia_20001954_homework1;

import java.util.Scanner;

public class ReversInt {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        int positiveInteger = Integer.parseInt(sc.nextLine());

        System.out.println("The reverse is: " + reverseInt(positiveInteger));
    }

    public static int reverseInt(int number) {
        int reverseInt = 0;
        while (number != 0) {
            reverseInt = reverseInt * 10 + number % 10;
            number /= 10;
        }
        return reverseInt;
    }
}
