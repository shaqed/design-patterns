package creational.abstract_factory;

public class Mainer {
    public static void main(String[] args) {
        GUIBuilder windowsBuilder = new GUIBuilder("windows"); // load the window factory
        GUIBuilder linuxBuilder = new GUIBuilder("linux"); // load the linux factory

        // Create windows widgets
        // You may cast them down (doesn't matter)
        Window windowsWindow = windowsBuilder.makeWindow();
        Button windowsButton = windowsBuilder.makeButton();

        System.out.println("Windows");
        System.out.println(windowsWindow);
        System.out.println(windowsButton);

        // Create linux widgets
        Window linuxWindow = linuxBuilder.makeWindow();
        Button linuxButton = linuxBuilder.makeButton();

        System.out.println("linux:");
        System.out.println(linuxWindow);
        System.out.println(linuxButton);

    }
}
