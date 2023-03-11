package NguyenXuanNghia_20001954_homework1;

public class CheckOddEven {

    public static void main(String[] args) {
        verifyResults();
    }

    public static void verifyResults() {
        int[] listCheckValue = {0, 1, 88, 99, -1, -2};

        for (int value: listCheckValue) {
            checkOddEven(value);
        }
    }

    public static void checkOddEven(int number) {
        System.out.println("The number is " + number);

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
        System.out.println("DONE\n");
    }
}
