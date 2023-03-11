package NguyenXuanNghia_20001954_homework1;

public class PrintNumberInWord {

    public static void main(String[] args) {
        verifyResults();
    }

    public static void verifyResults() {
        int[] listCheckValue = {0,1,2,3,4,5,6,7,8,9};

        for (int value: listCheckValue) {
            System.out.println("Word of " + value + " is: ");
            printNumberInWord(value);
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }

}
