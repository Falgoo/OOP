package nguyenxuannghia_20001954_lab1;

public class CheckPassFail {

    public static void main(String[] args) {
        verifyResult();
    }

    public static void verifyResult() {
        int[] listValueCheck = {0, 49, 50, 51, 100};

        for (int value: listValueCheck) {
            checkPassFail(value);
        }
    }

    public static void checkPassFail(int mark) {
        System.out.println("The number is " + mark);

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE\n");
    }
}
