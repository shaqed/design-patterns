package creational.builder;

public class Mainer {
    public static void main(String[] args) {
        Director director = new Director();

        Robot r = director.buildEnemyRobot(); // Build an EMENY robot
        System.out.println(r);
    }
}
