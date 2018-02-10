package behavioral.visitor;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Egg egg) {
        System.out.println("Egg with discount is: " + (egg.getPrice() * 0.80));
    }

    @Override
    public void visit(Milk milk) {
        System.out.println("Milk with discount is: " + (milk.getPrice() * 0.80));
    }
}
