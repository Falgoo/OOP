package nguyenxuannghia_20001954_lab2;

import java.util.Scanner;

public class Hex2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = sc.next();
        convertString(hexStr);
    }

    public static void convertString(String input) {
        try {
            int hex = Integer.parseInt(input, 16);
            System.out.println("The equivalent decimal number for hexadecimal \"" + input + "\" is: " + hex);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string \"" + input + "\"");
        }
    }
}
