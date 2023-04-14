package nguyenxuannghia_20001954.lab8.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 9, 12, 666, 9));

        insertFirst(list, 10);
        System.out.print("Insert first: ");
        print(list);

        insertLast(list, 155);
        System.out.print("\nInsert last: ");
        print(list);

        replace(list, 666);
        System.out.print("\nReplace value: ");
        print(list);

        removeThird(list);
        System.out.print("\nRemove third: ");
        print(list);

        removeEvil(list);
        System.out.print("\nRemove evil: ");
        print(list);

        System.out.print("\nGenerate square: ");
        print(generateSquare());

        System.out.print("\nContains: " + contains(list, 666));

        ArrayList<Integer> list2 = new ArrayList<>();
        copy(list, list2);
        System.out.print("\nCopy list: ");
        print(list2);

        reverse(list2);
        System.out.print("\nReverse using library: ");
        print(list2);

        reverseManual(list);
        System.out.print("\nReverse manual: ");
        print(list);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        insertBeginningEnd(linkedList, 10);
        System.out.print("\nInsert beginning and end: ");
        print(linkedList);
    }

    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list) {
        if (list.contains(666)) {
            list.remove(list.indexOf(666));
        }
    }

    public static List<Integer> generateSquare() {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(i * i);
        }
        return result;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        if (target == null) {
            return;
        }

        for (Integer integer : source) {
            target.add(integer);
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void print(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
