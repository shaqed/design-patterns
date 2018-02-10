package behavioral.template_method;

public class AlgorithmOne extends AbstractAlgorithm {
    @Override
    protected void swap(int[] A, int i, int j) {
        System.out.println("Swapping elements using a 3rd variable");
    }
}
