package creational.factory_method;

public class WidgetsFactory implements Factory {
    // Ask this class for creation of stuff

    // Ask for a scroll bar
    // This can be a specific class (this case)
    // OR
    // The ScrollBar can be an abstract class and you choose which one you want randomly
    public ScrollBar makeScrollBar() {
        return new ScrollBar();
    }

    // Example of generic button making, creation is based on the input of the function
    public Button makeButton(String os) {
        if (os.equals("windows")) {
            return new WinButton();
        } else if (os.equals("linux")) {
            return new LinuxButton();
        } else {
            System.out.println("Unsupported os: " + os);
            return null;
        }
    }

    // Ask for a specific window
    public Window makeWindow() {
        return new Window();
    }
}
