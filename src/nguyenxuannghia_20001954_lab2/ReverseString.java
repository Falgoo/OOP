package nguyenxuannghia_20001954_lab2;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string reverse: ");
        String string = sc.nextLine();

        System.out.print("Reverse string is: ");
        reverseString(string);
    }

    public static void reverseString(String string) {
        for (int index = string.length() - 1; index >= 0; index--) {
            System.out.print(string.charAt(index));
        }
    }
}
