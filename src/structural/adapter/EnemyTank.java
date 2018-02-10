package structural.adapter;

public class EnemyTank implements EnemyAttacker {
    @Override
    public void fireWeapon() {
        System.out.println("Tank attacks");
    }

    @Override
    public void driveForward() {
        System.out.println("Tank is driving");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("Driver: "+ driver + " is driving");
    }
}
