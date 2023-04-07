package nguyenxuannghia_20001954.lab2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CountVowelsDigits {

    static final String DIGIT = "[0-9]";
    static final String VOWEL = "[ueoai]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter string ");
        String string = sc.nextLine();

        int[] countDigitsVowels = countDigitsVowels(string);
        double[] percentagesDigitsVowels = percentagesDigitsVowels(countDigitsVowels, string.length());
        String digitFormat = df.format(percentagesDigitsVowels[0]);
        String vowelsFormat = df.format(percentagesDigitsVowels[1]);

        System.out.printf("%10s%4d%12s%1s\n","Number of vowels:",countDigitsVowels[1], vowelsFormat,"%");
        System.out.printf("%10s%4d%12s%1s","Number of digits:",countDigitsVowels[0],digitFormat,"%");
    }

    public static int[] countDigitsVowels(String string) {
        String newString = string.toLowerCase();
        int[] countDigitsVowels = new int[2];

        for (int index = 0; index < newString.length(); index++) {
            String stringIndex = String.valueOf(newString.charAt(index));
            if (Pattern.matches(DIGIT, stringIndex)) {
                countDigitsVowels[0]++;
            } else if (Pattern.matches(VOWEL, stringIndex)) {
                countDigitsVowels[1]++;
            }
        }
        return countDigitsVowels;
    }

    public static double[] percentagesDigitsVowels(int[] countDigitsVowels, int stringLength) {
        double[] percentagesDigitsVowels = new double[2];
        percentagesDigitsVowels[0] =  (double) countDigitsVowels[0] / stringLength * 100;
        percentagesDigitsVowels[1] = (double) countDigitsVowels[1] / stringLength * 100;
        return percentagesDigitsVowels;
    }
}
