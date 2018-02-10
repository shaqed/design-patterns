package structural.decorator;

public abstract class ShapeDecorator implements Shape {

    // Loads another shape
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        // Base your draw() method on the decorated shape
        // Your draw() method will execute based on the draw() of the shape
        this.decoratedShape.draw();

    }


}
