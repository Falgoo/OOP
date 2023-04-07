package nguyenxuannghia_20001954.lab3;

import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in array separate by space: ");
        String[] arrayInput = sc.nextLine().split(" ");
        int[] arrayInt = convertArrayStringToInt(arrayInput);
        print(arrayInt);
    }

    public static int[] convertArrayStringToInt(String[] arrayInput) {
        if (arrayInput[0].equals("")) {
            return new int[0];
        }

        int[] array = new int[arrayInput.length];
        for (int index = 0; index < arrayInput.length; index++) {
            array[index] = Integer.parseInt(arrayInput[index]);
        }
        return array;
    }

    public static double[] convertArrayStringToDouble(String[] arrayInput) {
        if (arrayInput[0].equals("")) {
            return new double[0];
        }
        double[] array = new double[arrayInput.length];
        for (int index = 0; index < arrayInput.length; index++) {
            array[index] = Double.parseDouble(arrayInput[index]);
        }
        return array;
    }

    public static float[] convertArrayStringToFloat(String[] arrayInput) {
        if (arrayInput[0].equals("")) {
            return new float[0];
        }
        float[] array = new float[arrayInput.length];
        for (int index = 0; index < arrayInput.length; index++) {
            array[index] = Float.parseFloat(arrayInput[index]);
        }
        return array;
    }

    public static void print(int[] array) {

        if (array.length != 0) {
            System.out.print("[");
            for (int index = 0; index < array.length; index++) {
                if (index == array.length - 1) {
                    System.out.print(array[index] + "]");
                } else {
                    System.out.print(array[index] + ", ");
                }
            }
        } else {
            System.out.print("[]");
        }
    }

    public static void print(double[] array) {
        if (array.length != 0) {
            System.out.print("[");
            for (int index = 0; index < array.length; index++) {
                if (index == array.length - 1) {
                    System.out.print(array[index] + "]");
                } else {
                    System.out.print(array[index] + ", ");
                }
            }
        } else {
            System.out.print("[]");
        }
    }

    public static void print(float[] array) {

        if (array.length != 0) {
            System.out.print("[");
            for (int index = 0; index < array.length; index++) {
                if (index == array.length - 1) {
                    System.out.print(array[index] + "]");
                } else {
                    System.out.print(array[index] + ", ");
                }
            }
        } else {
            System.out.print("[]");
        }
    }
}
