package learn_design_patterns.behaviors.strategies;

public class SelectionSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sort using selection sort");
    }
}
