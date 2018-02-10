package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    // A case of a structural.decorator
    // A decorates the shape to be red
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Decorating RED");

    }
}
