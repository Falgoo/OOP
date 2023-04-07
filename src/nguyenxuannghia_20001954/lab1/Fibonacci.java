package nguyenxuannghia_20001954.lab1;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 20;
        double[] listFibonacciAndAverage = fibonacci(number);
        double[] listFibonacciThreePrevious = fibonacciThreePrevious(number);

        System.out.println("The first " + number + " Fibonacci numbers are: ");

        for (int i = 0; i < number; i++) {
            System.out.print((int) listFibonacciAndAverage[i] + " ");
        }

        System.out.println("\nThe average: " + listFibonacciAndAverage[number]);

        System.out.println("\nThe first " + number + " Fibonacci with 3 previous numbers are: ");
        for (int i = 0; i < number; i++) {
            System.out.print((int) listFibonacciThreePrevious[i] + " ");
        }
    }

    public static double[] fibonacci(int number) {
        double[] listFibonacciAndAverage = new double[number+1];
        int n = 2;
        listFibonacciAndAverage[0] = 1;
        listFibonacciAndAverage[1] = 1;

        while(n < number) {
            listFibonacciAndAverage[n] = listFibonacciAndAverage[n-1] + listFibonacciAndAverage[n -2];
            n++;
        }

        double sumFibonacci = 0.0;
        for (n = 0; n <= number; n++) {
            sumFibonacci += listFibonacciAndAverage[n];
        }
        listFibonacciAndAverage[number] = sumFibonacci / number;

        return listFibonacciAndAverage;
    }

    public static double[] fibonacciThreePrevious(int number) {
        double[] listFibonacci = new double[number];
        int n = 3;
        listFibonacci[0] = 1;
        listFibonacci[1] = 1;
        listFibonacci[2] = 2;

        while(n < number) {
            listFibonacci[n] = listFibonacci[n-1] + listFibonacci[n -2] + listFibonacci[n - 3];
            n++;
        }
        return listFibonacci;
    }
}
