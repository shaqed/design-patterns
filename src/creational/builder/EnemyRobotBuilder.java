package creational.builder;

public class EnemyRobotBuilder extends RobotBuilder{


    @Override
    protected void buildLegs() {
        // Assume that setting each of these is a heavy process
        // And we require "building" these independently

        // AND - perhaps we want to skip it altogether
        this.robot.setLegs("these legs");
    }

    @Override
    protected void buildTorso() {
        this.robot.setTorso("that torso");
    }

    @Override
    protected void buildColor() {
        this.robot.setColor("green");
    }
    // This class will build a specific robot, an enemy robot
}
