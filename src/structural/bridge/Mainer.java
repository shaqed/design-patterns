package structural.bridge;

public class Mainer {
    public static void main(String[] args) {

        ActualCode program = new ProgramCode(); // The code the programmer wrote

        // The tests the tester wrote
        AbstractTest test[] = {new TestAdd(program), new TestSubtract(program)};

        // Each of the tests is loaded with the same program


    }
}
