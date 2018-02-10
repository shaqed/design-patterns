package creational.abstract_factory;

public class WindowsFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
