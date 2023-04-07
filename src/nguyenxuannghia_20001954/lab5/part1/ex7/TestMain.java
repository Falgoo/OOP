package nguyenxuannghia_20001954.lab5.part1.ex7;

import java.util.Scanner;

public class TestMain {

    final static String ISREAL = "i) is a pure real number";
    final static String NOTISREAL = "i) is NOT a pure real number";
    final static String BRACKETS = "(";
    final static String IBRACKETS = "i)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double firstReal = Double.parseDouble(sc.next());
        double firstImag = Double.parseDouble(sc.next());

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double secondReal = Double.parseDouble(sc.next());
        double secondImag = Double.parseDouble(sc.next());
        sc.close();

        MyComplex num1 = new MyComplex(firstReal, firstImag);
        MyComplex num2 = new MyComplex(secondReal, secondImag);

        System.out.println("Number 1 is: (" + num1 + IBRACKETS);
        printResult(num1);

        System.out.println("Number 2 is: (" + num2 + IBRACKETS);
        printResult(num2);

        compareNum(num1, num2);

        System.out.println(BRACKETS + num1 + "i) + (" + num2 + "i) = (" + num1.addNew(num2) + IBRACKETS);
    }

    public static void printResult(MyComplex num) {
        if (num.isReal()) {
            System.out.println(BRACKETS + num + ISREAL);
        } else {
            System.out.println(BRACKETS + num + NOTISREAL);
        }
        if (num.isImaginary()) {
            System.out.println(BRACKETS + num + ISREAL);
        } else {
            System.out.println(BRACKETS + num + NOTISREAL);
        }
    }

    public static void compareNum(MyComplex num1, MyComplex num2) {
        if (num1.equals(num2)) {
            System.out.println(BRACKETS + num1 + "i) is equal to (" + num2 + IBRACKETS);
        } else {
            System.out.println(BRACKETS + num1 + "i) is NOT equal to (" + num2 + IBRACKETS);
        }
    }
}
