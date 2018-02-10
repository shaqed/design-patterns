package creational.builder;

public class Robot {
    private String legs;
    private String torso;
    private String color;

    public Robot() {
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getTorso() {
        return torso;
    }

    public void setTorso(String torso) {
        this.torso = torso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.legs + ", " + this.torso + ", " + this.color;
    }
}
