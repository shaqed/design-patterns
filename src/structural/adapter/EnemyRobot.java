package structural.adapter;

public class EnemyRobot {

    public void smashWithHands() {
        System.out.println("Enemy robot attacks with hands");
    }

    public void walk() {
        System.out.println("Robot is walking forward");
    }

    public void reactTo(String name) {
        System.out.println("Robot is reacting to " + name);
    }
}
