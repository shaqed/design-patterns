package creational.abstract_factory;

public class LinuxFactory implements AbstractWidgetFactory{
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
