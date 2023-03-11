package NguyenXuanNghia_20001954_lab2;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary string: ");
        String binStr = sc.next();
        convertString(binStr);
    }

    public static void convertString(String input) {
        try {
            int decimal = Integer.parseInt(input, 2);
            System.out.println("The equivalent decimal number for binary \"" + input + "\" is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid binary string \"" + input + "\"");
        }
    }
}
