package NguyenXuanNghia_20001954_lab2;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String keyPad = sc.nextLine().toUpperCase();
        phoneKeyPad(keyPad);

        System.out.println("\nPhone key pad with switch case:");
        for (int i = 0 ; i < keyPad.length(); i++) {
            PhoneKeyPadSwitchCase(keyPad.charAt(i));
        }
    }

    public static void phoneKeyPad(String string) {
        String[] phoneKey = {"ABC", "DEF", "GHI", "JKL",
                            "MNO", "PQRS", "TUV", "WXYZ"};
        String[] newString = string.split("");
        for (String s : newString) {
            for (int phoneIndex = 0 ; phoneIndex < phoneKey.length ; phoneIndex++) {
                int indexNumber = phoneKey[phoneIndex].indexOf(s);
                if (indexNumber != - 1) {

                    for (int repeat = 0 ; repeat <= indexNumber ; repeat++) {
                        int value = phoneIndex + 2;
                        System.out.print(value);
                    }
                }
            }
            System.out.print(",");
        }
    }

    public static void  PhoneKeyPadSwitchCase(char inChar) {
        switch (inChar) {
            case 'A', 'B', 'C' -> System.out.print("2");
            case 'D', 'E', 'F' -> System.out.print("3");
            case 'G', 'H', 'I' -> System.out.print("4");
            case 'J', 'K', 'L' -> System.out.print("5");
            case 'M', 'N', 'O' -> System.out.print("6");
            case 'P', 'Q', 'R', 'S' -> System.out.print("7");
            case 'T', 'U', 'V' -> System.out.print("8");
            default -> System.out.print("9");
        }
    }
}
