package creational.builder;

public class Director {

    public Robot buildEnemyRobot() {
        RobotBuilder builder = new EnemyRobotBuilder();

        builder.buildColor(); // Client wanted to apply the enemy's color
        builder.buildTorso(); // Client wanted to apply a torso

        return builder.build(); // Done, return the finalized robot to the client
    }
}
