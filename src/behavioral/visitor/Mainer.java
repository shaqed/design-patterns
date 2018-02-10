package behavioral.visitor;

public class Mainer {
    public static void main(String[] args) {
        // The visitor
        Visitor tax = new TaxVisitor();

        // Basic functionality ingredients
        Milk milk = new Milk();
        Egg egg = new Egg();


        egg.accept(tax);
        milk.accept(tax);


        // You can now declare a different Visitor who will use the egg and the milk DIFFERENTLY
        // hereby allowing these objects more functionality from an outside source (the visitor)


        Visitor discount = new DiscountVisitor();
        egg.accept(discount);
        milk.accept(discount);
    }
}
