package creational.factory_method;

public class Mainer {
    public static void main(String[] args) {
        WidgetsFactory widgetsFactory = new WidgetsFactory(); // Fetch the factory

        ScrollBar scrollBar = widgetsFactory.makeScrollBar(); // Ask for a scroll bar
        Window window = widgetsFactory.makeWindow(); // Ask for a windows

        // Ask for a button of different kinds
        Button linuxButton = widgetsFactory.makeButton("linux");
        Button windowsButton = widgetsFactory.makeButton("windows");

        System.out.println(scrollBar);
        System.out.println(window);
        System.out.println(linuxButton);
        System.out.println(windowsButton);
    }
}
