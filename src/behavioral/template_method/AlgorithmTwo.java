package behavioral.template_method;

public class AlgorithmTwo extends AbstractAlgorithm {
    @Override
    protected void swap(int[] A, int i, int j) {
        System.out.println("Swapping elements without using a 3rd element");
    }
}
