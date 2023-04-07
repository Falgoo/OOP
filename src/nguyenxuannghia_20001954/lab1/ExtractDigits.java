package nguyenxuannghia_20001954.lab1;

import java.util.ArrayList;
import java.util.List;

public class ExtractDigits {

    public static void main(String[] args) {
        int number = 14523;
        List<Integer> listDigits = extractDigits(number);

        for (Integer listDigit : listDigits) {
            System.out.print(listDigit + " ");
        }
    }

    public static List<Integer> extractDigits(int number) {
        List<Integer> listDigits = new ArrayList<>();

        while(number != 0) {
            listDigits.add(number % 10);
            number /= 10;
        }
        return listDigits;
    }
}
