package nguyenxuannghia_20001954.lab2;

import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Octal string: ");
        String octStr = sc.next();
        convertString(octStr);
    }

    public static void convertString(String input) {
        try {
            int octal = Integer.parseInt(input, 8);
            System.out.println("The equivalent decimal number for octal \"" + input + "\" is: " + octal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid octal string \"" + input + "\"");
        }
    }
}
