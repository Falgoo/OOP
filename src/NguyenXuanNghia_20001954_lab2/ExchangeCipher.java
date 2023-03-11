package NguyenXuanNghia_20001954_lab2;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String string = sc.next().toUpperCase();
        convertCode(string);
    }

    public static void convertCode(String input) {
        int cipherTextChar = 'A' + 'Z';
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int plainTextChar = input.charAt(i);
            result.append(String.valueOf(Character.toChars(cipherTextChar - plainTextChar)));
        }

        System.out.println("The ciphertext string is: " + result);
    }
}
