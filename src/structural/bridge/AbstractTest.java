package structural.bridge;

public abstract class AbstractTest {
    protected ActualCode actualCode;

    public AbstractTest(ActualCode actualCode) {
        this.actualCode = actualCode;
    }

    protected abstract void goTest();
}
