package behavioral.strategy;

public class Mainer {
    public static void main(String[] args) {
        SortingStrategy bubble = new BubbleSort();
        SortingStrategy quick = new Quicksort();

        new LongAlgorithm(bubble).runAlgorithm();
        new LongAlgorithm(quick).runAlgorithm();
    }
}
