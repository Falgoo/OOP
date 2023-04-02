package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class HasEight {

    public static void main(String[] args) {
        int sumHasEight = sumEight();
        System.out.print("Sum has eight is: " + sumHasEight);
    }

    public static boolean hasEight(int input) {
        String stringInput = String.valueOf(input);

        for (int index = 0; index < stringInput.length(); index++) {
            if (stringInput.charAt(index) == '8') {
                return true;
            }
        }
        return false;
    }

    public static int sumEight() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input;

        do {
            System.out.print("Enter positive number (or -1 to end) ");
            input = Integer.parseInt(sc.nextLine());

            if (hasEight(input)) {
                sum += input;
            }

        } while (input != -1);

        return sum;
    }
}
