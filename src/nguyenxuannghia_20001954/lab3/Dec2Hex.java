package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class Dec2Hex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal: ");
        int decimal = Integer.parseInt(sc.nextLine());
        System.out.print("Hexadecimal of 10 is: " + toHex(decimal));
    }

    public static String toHex(int decimal) {
        int rem;
        String hex = "";
        String hexChars[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        while (decimal > 0) {
            rem = decimal % 16;
            hex = hexChars[rem] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }
}
