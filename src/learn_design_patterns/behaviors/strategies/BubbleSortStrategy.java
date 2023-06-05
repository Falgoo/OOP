package learn_design_patterns.behaviors.strategies;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sort using bubble sort");
    }
}
