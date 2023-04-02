package nguyenxuannghia_20001954_lab3;

import java.util.Scanner;

public class Hex2Bin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hex String: ");
        String hexString = sc.nextLine().toLowerCase();
        String[] hexStringArray = hexString.split("");
        String binaryString = convertStringToBinary(hexStringArray);
        System.out.print("The equivalent binary for hexadecimal " + hexString + "is: " + binaryString);
    }

    public static String convertStringToBinary(String[] hexStr) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                                    "0100", "0101", "0110", "0111",
                                    "1000", "1001", "1010", "1011",
                                    "1100", "1101", "1110", "1111"};

        final String[] HEX_DIGITS = {"0", "1", "2", "3",
                                    "4", "5", "6", "7",
                                    "8", "9", "a", "b",
                                    "c", "d", "e", "f"};
        String binary = "";
        for (String hex : hexStr) {
            for (int index = 0; index < HEX_DIGITS.length; index++) {
                if (hex.equals(HEX_DIGITS[index])) {
                    binary = binary + HEX_BITS[index] + " ";
                }
            }
        }
        return binary;
    }


}
