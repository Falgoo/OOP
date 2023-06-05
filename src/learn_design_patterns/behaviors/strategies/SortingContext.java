package learn_design_patterns.behaviors.strategies;

public class SortingContext {

    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[] array) {
        sortStrategy.sort(array);
    }
}
