package learn_design_patterns.behaviors.strategies;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sort using quick sort");
    }
}
