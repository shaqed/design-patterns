package structural.adapter;

/**
 * Adapts the functions from the existing EnemyRobot
 * To be compatible with Enemy Attacker
 * */
public class EnemyRobotAdapter implements EnemyAttacker{


    // Load a robot, and adapt it to comply with enemy attacker
    private EnemyRobot robot;
    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        // I decided that this is equivalent to fireWeapon()
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walk(); // same
    }

    @Override
    public void assignDriver(String driver) {
        robot.reactTo(driver); // React to the driver
        // again - you decide!!
    }
}
