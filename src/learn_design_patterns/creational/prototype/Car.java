package learn_design_patterns.creational.prototype;

public class Car implements CarPrototype {

    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public CarPrototype clone() {
        return new Car(model, color);
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }
}
