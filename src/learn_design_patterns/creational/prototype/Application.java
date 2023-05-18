package learn_design_patterns.creational.prototype;

public class Application {

    public static void main(String[] args) {
        CarRegistry.loadPrototypes();

        CarPrototype car1 = CarRegistry.getPrototype("camry");
        if (car1 != null) {
            car1.displayInfo();
        }

        CarPrototype car2 = CarRegistry.getPrototype("civic");
        if (car2 != null) {
            car2.setColor("Red");
            car2.displayInfo();
        }
    }
}
