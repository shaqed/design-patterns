package behavioral.template_method;

public class Mainer {
    public static void main(String[] args) {
        int a [] = {4,2,45,6,3};
        new AlgorithmOne().sort(a); // Run the same algorithm with different swaps
        new AlgorithmTwo().sort(a);
    }
}
