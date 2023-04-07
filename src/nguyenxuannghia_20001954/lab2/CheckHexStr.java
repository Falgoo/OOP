package nguyenxuannghia_20001954.lab2;

import java.util.Scanner;

public class CheckHexStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex string: ");
        String hexStr = sc.nextLine();

        checkHexStr(hexStr);
    }

    public static void checkHexStr(String input) {
        boolean result = true;

        for (int i = 0; i < input.length(); i++) {
            char inChar = input.charAt(i);
            if (!(inChar >= '0' && inChar <= '9' ||
                    inChar >= 'A' && inChar <= 'F' ||
                    inChar >= 'a' && inChar <= 'f')) {
                result = false;
            }
        }

        if (result) {
            System.out.println("\"" + input + "\" is a hex string");
        } else {
            System.out.println("\"" + input + "\" is NOT a hex string");
        }
    }
}
