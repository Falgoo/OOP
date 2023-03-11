package NguyenXuanNghia_20001954_homework1;

public class PrintDayInWord {

    public static void main(String[] args) {
        verifyResults();
    }

    public static void verifyResults() {
        int[] listCheckValue = {0,1,2,3,4,5,6,7};

        for (int value: listCheckValue) {
            System.out.println("Day of " + value + " is: ");
            printDayInWord(value);
        }
    }

    public static void printDayInWord(int dayNumber) {
        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day");
        }
    }

}
