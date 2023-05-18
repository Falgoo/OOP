package learn_design_patterns.creational.prototype;

public interface CarPrototype {

    CarPrototype clone();

    void setModel(String model);

    void setColor(String color);

    String getModel();

    String getColor();

    void displayInfo();
}
