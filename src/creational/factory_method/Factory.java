package creational.factory_method;

public interface Factory {
    ScrollBar makeScrollBar(); // THIS IS A FACTORY METHOD
    Button makeButton(String os); // THIS IS A FACTORY METHOD
    Window makeWindow(); // THIS IS A FACTORY METHOD
}
