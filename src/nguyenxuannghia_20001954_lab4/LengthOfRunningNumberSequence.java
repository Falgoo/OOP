package nguyenxuannghia_20001954_lab4;

import java.util.Scanner;

public class LengthOfRunningNumberSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println("Length of " + number + " is: " + len(number));
    }

   public static int numOfDigits(int number) {
        String newNumberString = String.valueOf(number);
        int count = 0;

        for (int len = 0; len < newNumberString.length(); len++) {
            count++;
        }
        return count;
   }

   public static int len(int number) {
        if (number == 1) {
            return 1;
        }
        return len(number - 1) + numOfDigits(number);
   }
}
