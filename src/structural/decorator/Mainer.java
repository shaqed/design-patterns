package structural.decorator;

public class Mainer {
    public static void main(String[] args) {


        // Gets a structural.decorator (red one)
        // Load it with the circle
        Shape circle = new Circle();
        Shape redDecorationOfACircle = new RedShapeDecorator(circle);
        // Now the circle is decorated with red
        // And we see that via the redShapeSecoration object


        // No decoration!
        Shape circleBlank = new Circle();


        redDecorationOfACircle.draw();
        System.out.println("---");
        circleBlank.draw();


        // Now we can take the red decoration
        // And load a new decoration with it!

        Shape decoration2 = new GreenShapeDecorator(redDecorationOfACircle);

        // Now when we print it - we will use the blank -> the red -> the green

        System.out.println("----");
        decoration2.draw();

        // Keep in mind you have to change the object you're working with every time
        // You can use a wrapper class for that maybe

    }
}
