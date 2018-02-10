package behavioral.template_method;

public abstract class AbstractAlgorithm {

    // Algorithm is NOT TO BE CHANGED!
    public final void sort(int[] arr) {
        // ...
        // using a special kind of sorting here ...
        // But we the swap is different based on the abstract method: swap
        swap(arr, 0 , 3); // We don't know how this will be performed - because this is an abstract class!

    }

    // Abstract method, based on the implementation
    protected abstract void swap(int[] A, int i, int j);
}
