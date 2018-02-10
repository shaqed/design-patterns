package behavioral.strategy;

public class LongAlgorithm {
    // This long algorithm will require sorting at some point
    // He will use the sorting based on the SortingStrategy provided

    private SortingStrategy sortingStrategy;
    public LongAlgorithm(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void runAlgorithm() {
        int a [] = {1,2,3,4};
        // ... do stuff ...

        this.sortingStrategy.sort(a); // Sort using the strategy

        // ... do more stuff ...
    }
}
