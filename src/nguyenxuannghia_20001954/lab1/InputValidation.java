package nguyenxuannghia_20001954.lab1;

import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        validateInput();
    }

    public static void validateInput() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;

        do {
            System.out.print("Enter a number between 0−10 or 90−100: ");
            int number = Integer.parseInt(sc.nextLine());

            if (number >= 0 && number <= 10 || number >= 90 && number <= 100) {
                System.out.println("You have entered: " + number);
                isValid = true;
            } else {
                System.out.println("Invalid input , try again ...");
            }
        }while(!isValid);
    }
}
