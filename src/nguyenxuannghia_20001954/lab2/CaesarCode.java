package nguyenxuannghia_20001954.lab2;

import java.util.Scanner;

public class CaesarCode {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String string = scan.nextLine().toUpperCase();
        convertCode(string);
    }

    public static void convertCode(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'X' && input.charAt(i) != 'Y' && input.charAt(i) != 'Z') {
                result.append((char) (input.charAt(i) + 3));
            } else if (input.charAt(i) == 'X') {
                result.append('A');
            } else if (input.charAt(i) == 'Y') {
                result.append('B');
            } else {
                result.append('C');
            }
        }
        System.out.println("The ciphertext string is: " + result);
    }
}
