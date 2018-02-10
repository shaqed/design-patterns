package structural.bridge;

public class TestAdd extends AbstractTest {

    public TestAdd(ActualCode actualCode) {
        super(actualCode);
    }

    @Override
    protected void goTest() {
        // We're testing only the Foo One
        // Since there's probably a lot to test

        // Use the ActualCode object to call foo1 and base your tests here
        int ans1 = this.actualCode.add(1,2);

        // ... and so on ...
    }


}
