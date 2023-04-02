package nguyenxuannghia_20001954_lab2;

import java.util.Scanner;

public class RadixN2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your radix: ");
        int radix = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your string: ");
        String string = sc.nextLine();
        convertString(radix, string);
    }

    public static void convertString(int radix, String input) {
        try {
            int result = Integer.parseInt(input, radix);
            System.out.println("The equivalent decimal number \"" + input + "\" is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid string \"" + input + "\"");
        }
    }
}
