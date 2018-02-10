package structural.adapter;

public class Mainer {

    public static void main(String[] args) {
        // Tank has the EnemyAttacker methods
        EnemyTank tank = new EnemyTank();

        EnemyRobot robot = new EnemyRobot();
        // Robot does not have these methods
        // it has different ones

        // So - instead of thinking about the adaptation, you already have that

        EnemyRobotAdapter adapter = new EnemyRobotAdapter(robot);


        // Now we can use the same methods for both robot and tank

        EnemyAttacker attackers [] = {tank, adapter};

        for (int i = 0; i < attackers.length; i++) {
            attackers[i].fireWeapon();
            attackers[i].driveForward();

        }

    }
}
