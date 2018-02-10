package structural.bridge;

public class TestSubtract extends AbstractTest {

    public TestSubtract(ActualCode actualCode) {
        super(actualCode);
    }

    @Override
    protected void goTest() {
        // Here use the subtract method only to test the subtract of the actual code object

        int ans = this.actualCode.subtract(5,3);
        // And so on ...
    }
}
