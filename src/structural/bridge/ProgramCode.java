package structural.bridge;

public class ProgramCode implements ActualCode {
    // The program code can grow independently of the testing
    // You can write however many tests that you like, and the person writing the code doesn't have to care about that

    // All the programmer needs to provide is to implement the interface and link it to its code





    private void foo1(){

    }

    private void foo2() {

    }

    private void foo3() {

    }

    private void foo4() {

    }

    @Override
    public int add(int a, int b) {
        // Initially, we were required to to provide the "add" functionality
        // So we must implement that
        // Our code is more complex, in order to calculate the add we have to call our own functions and stuff

        // So - we call these functions but then - make sure we return the correct answer

        foo1(); // I have to do this
        foo2(); // I have to do that as well !
        int ans = a + b; // Now I can have an answer
        return ans; // There we go
    }

    @Override
    public int subtract(int a, int b) {
        // Same here, let's assume that calculating subtract is difficult and requires foo3 and 4
        foo3();
        foo4();
        return a-b; // Now I'm able to calculate subtraction!
    }
}
