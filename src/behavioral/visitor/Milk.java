package behavioral.visitor;

public class Milk implements Visitable {

    private double price = 3.0;


    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Give that visitor access to your data
    }
}
