package structural.decorator;

public class GreenShapeDecorator extends ShapeDecorator{

    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Decorating the shape to be GREEN");
    }
}
