package nguyenxuannghia_20001954.lab1;

public class HarmonicSum {

    public static void main(String[] args) {
        int n = 50000;
        double sumLeftToRight = sumLeftToRight(n);
        double sumRightToLeft = sumRightToLeft(n);
        double absDff = Math.abs(sumRightToLeft - sumLeftToRight);

        System.out.println("Sum left to right is: " + sumLeftToRight);
        System.out.println("Sum right to left is: " + sumRightToLeft);
        System.out.println("Absolute difference is: " + absDff);

    }

    public static double sumLeftToRight(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1/ i;
        }
        return sum;
    }

    public static double sumRightToLeft(int n) {
        double sum = 0;
        for (int i = n; i > 0; i--) {
            sum += (double) 1 / i;
        }
        return sum;
    }
}
