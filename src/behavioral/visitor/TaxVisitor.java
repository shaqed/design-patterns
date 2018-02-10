package behavioral.visitor;

public class TaxVisitor implements Visitor {


    @Override
    public void visit(Egg egg) {
        // Egg has given you the access to its price
        double eggPrice = egg.getPrice();

        // Do whatever you want now
        System.out.println("Egg with tax is: " + (eggPrice * 1.18));
    }

    @Override
    public void visit(Milk milk) {
        // Milk has given you the access to its price
        double milkPrice = milk.getPrice();

        // do whatever...
        System.out.println("Milk with tax is: " + (milkPrice * 1.18));
    }
}
