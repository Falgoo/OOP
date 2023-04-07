package nguyenxuannghia_20001954.lab2;

import java.util.Scanner;

public class DecipherCaesarCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        String string = sc.nextLine().toUpperCase();
        convertCode(string);
    }

    public static void convertCode(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'A' && input.charAt(i) != 'B' && input.charAt(i) != 'C') {
                result.append((char) (input.charAt(i) - 3));
            } else if (input.charAt(i) == 'A') {
                result.append('X');
            } else if (input.charAt(i) == 'B') {
                result.append('Y');
            } else {
                result.append('Z');
            }
        }
        System.out.println("The plaintext string is: " + result);
    }
}
