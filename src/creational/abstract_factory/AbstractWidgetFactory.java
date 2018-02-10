package creational.abstract_factory;

public interface AbstractWidgetFactory {
    Window createWindow(); // User needs a window!
    Button createButton(); // User needs a button!
}
