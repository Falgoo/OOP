package nguyenxuannghia_20001954.lab10.patterns.strategy.exercise3;

public class Test {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 10, 1, 4};

        SortContext context = new SortContext();

        // Sorting using Bubble Sort
        context.setSortingStrategy(new BubbleSort());
        context.sortArray(array);

        // Sorting using Selection Sort
        context.setSortingStrategy(new SelectionSort());
        context.sortArray(array);

        // Sorting using Insertion Sort
        context.setSortingStrategy(new InsertionSort());
        context.sortArray(array);
    }
}
