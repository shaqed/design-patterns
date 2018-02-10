package creational.builder;

public abstract class RobotBuilder {

    protected Robot robot;
    public RobotBuilder() {
        this.robot = new Robot();
    }

    protected abstract void buildLegs();
    protected abstract void buildTorso();
    protected abstract void buildColor();
    public Robot build() {
        return this.robot;
    }
}
