package learn_design_patterns.behaviors.strategies;

public class Application {

    public static void main(String[] args) {
        int[] array = new int[] {3,1,2,6,5,4};
        SortingContext sortingContext = new SortingContext();

        sortingContext.setSortStrategy(new BubbleSortStrategy());
        sortingContext.sortArray(array);

        sortingContext.setSortStrategy(new QuickSortStrategy());
        sortingContext.sortArray(array);

        sortingContext.setSortStrategy(new SelectionSortStrategy());
        sortingContext.sortArray(array);
    }
}
