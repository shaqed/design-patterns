package creational.abstract_factory;

public class GUIBuilder {
    // ask this class for UI Components

    private AbstractWidgetFactory factory;

    // You can ask directly for a factory
    public GUIBuilder(AbstractWidgetFactory factory) {
        this.factory = factory;
    }

    // Load the factory based on a string
    public GUIBuilder(String os) {
        if (os.equals("windows")) {
            this.factory = new WindowsFactory();
        } else if (os.equals("linux")) {
            this.factory = new LinuxFactory();
        } else {
            System.out.println("Unsupported GUI Components for your OS : " + os);
        }
    }

    // make a window based on this OS
    public Window makeWindow() {
        return this.factory.createWindow();
    }

    // make a button based on this OS
    public Button makeButton() {
        return this.factory.createButton();
    }
}
