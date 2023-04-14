package nguyenxuannghia_20001954.lab8.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        Set<Integer> first = new HashSet<>(Arrays.asList(2,3,4,5,6));
        Set<Integer> second = new HashSet<>(Arrays.asList(5,7,9,9,2,6));

        System.out.print("Intersection manual: " + intersectionManual(first, second));
        System.out.print("\nUnion manual: " + unionManual(first, second));
        System.out.print("\nIntersection using function: " + intersection(first, second));
        System.out.print("\nUnion using function: " + union(first, second));

        List<Integer> list = toList(first);
        System.out.print("\nTo list: ");
        print(list);

        List<Integer> list2 = removeDuplicates(list);
        System.out.print("\nRemove duplicates: ");
        print(list2);

        List<Integer> list3 = removeDuplicatesManual(list);
        System.out.print("\nRemove duplicates manual: ");
        print(list3);

        String s = new String("helloworld");
        System.out.print("\nFirst recurring character: " + firstRecurringCharacter(s));
        System.out.println("\nAll recurring character: " + allRecurringChars(s));
    }

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();

        for (Integer firstValue : first) {
            for (Integer secondValue: second) {

                if (firstValue.compareTo(secondValue) == 0) {
                    intersection.add(firstValue);
                }
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = first;
        for (Integer secondValue: second) {
            union.add(secondValue);
        }
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();

        for (Integer secondValue: second) {
            if (first.contains(secondValue)) {
                intersection.add(secondValue);
            }
        }
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = first;
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source.size());
        source.removeIf(p -> !set.add(p));
        return source;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> listWithoutDuplicate = new ArrayList<>();
        for (Integer value: source) {
            if (!listWithoutDuplicate.contains(value)) {
                listWithoutDuplicate.add(value);
            }
        }
        return listWithoutDuplicate;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (characters.contains(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            } else {
                characters.add(s.charAt(i));
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChars = new HashSet<>();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            } else {
                recurringChars.add(s.charAt(i));
            }
        }
        return recurringChars;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        return array = source.toArray(array);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }

    public static void print(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
