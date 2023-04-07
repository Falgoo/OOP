package nguyenxuannghia_20001954_lab1;

public class SumAverageRunningInt {

    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
//        final int LOWERBOUND = 111;
//        final int UPPERBOUND = 8899;
        final String LOWER_TO_UPPER = LOWERBOUND + " to " + UPPERBOUND + " is: ";

        double[] sumAverage = sumRunningInt(LOWERBOUND, UPPERBOUND);
        double[] sumAverageWhileLoop = sumRunningIntInWhileLoop(LOWERBOUND, UPPERBOUND);
        double[] sumAverageDoWhileLoop = sumRunningIntInDoWhileLoop(LOWERBOUND, UPPERBOUND);
        int sumSquares = sumSquares(LOWERBOUND, UPPERBOUND);
        int[] sumEvenOdd = sumOddEven(LOWERBOUND, UPPERBOUND);
        int absDff = Math.abs(sumEvenOdd[0] - sumEvenOdd[1]);

        System.out.println("The sum with for loop of " + LOWER_TO_UPPER + (int)sumAverage[0]);
        System.out.println("The average with for loop is: " + sumAverage[1]);

        System.out.println("\nThe sum with while do loop of " + LOWER_TO_UPPER + (int)sumAverageWhileLoop[0]);
        System.out.println("The average with while do loop is: " + sumAverageWhileLoop[1]);

        System.out.println("\nThe sum of with do while loop " + LOWER_TO_UPPER + (int)sumAverageDoWhileLoop[0]);
        System.out.println("The average with do while loop is: " + sumAverageDoWhileLoop[1]);

        System.out.println("\nSum of squares from " + LOWER_TO_UPPER + sumSquares);

        System.out.println("\nSum even from " + LOWER_TO_UPPER + sumEvenOdd[0]);
        System.out.println("Sum odd from " + LOWER_TO_UPPER + sumEvenOdd[1]);
        System.out.println("Absolute difference is: " + absDff);
    }

    public static double[] sumRunningInt(int lowerBound, int upperBound) {
        double[] sumAverage = new double[2];
        int count = 0;

        for (int number = lowerBound; number <= upperBound; number++) {
            sumAverage[0] += number;
            count ++;
        }

        sumAverage[1] = sumAverage[0] / count;
        return sumAverage;
    }

    public static double[] sumRunningIntInWhileLoop(int lowerBound, int upperBound) {
        double[] sumAverage = new double[2];
        int number = lowerBound;
        int count = 0;

        while (number <= upperBound) {
            sumAverage[0] += number;
            number += 1;
            count++;
        }

        sumAverage[1] = sumAverage[0] / count;
        return sumAverage;
    }

    public static double[] sumRunningIntInDoWhileLoop(int lowerBound, int upperBound) {
        double[] sumAverage = new double[2];
        int number = lowerBound;
        int count = 0;
        do {
            sumAverage[0] += number;
            number += 1;
            count++;
        } while (number <= upperBound);

        sumAverage[1] = sumAverage[0] / count;
        return sumAverage;
    }

    public static int sumSquares(int lowerBound, int upperBound) {
        int sumSquares = 0;
        for (int number = lowerBound; number <= upperBound; number++) {
            sumSquares += number * number;
        }
        return sumSquares;
    }

    public static int[] sumOddEven(int lowerBound, int upperBound) {
        int[] sumEvenOdd = new int[3];

        for (int number = lowerBound; number <= upperBound; number++) {
            if (number % 2 == 0) {
                sumEvenOdd[0] += number;
            } else {
                sumEvenOdd[1] += number;
            }
        }
        return sumEvenOdd;
    }

}
