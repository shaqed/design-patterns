package behavioral.visitor;

public class Egg implements Visitable {

    private double price = 4.5;


    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
