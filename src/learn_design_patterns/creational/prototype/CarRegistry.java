package learn_design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry {

    private static Map<String, CarPrototype> carPrototypes = new HashMap<>();

    public static void loadPrototypes() {
        CarPrototype car1 = new Car("Toyota Camry", "Silver");
        CarPrototype car2 = new Car("Honda Civic", "Black");
        CarPrototype car3 = new Car("BMW 3 Series", "Blue");

        carPrototypes.put("camry", car1);
        carPrototypes.put("civic", car2);
        carPrototypes.put("bmw", car3);
    }

    public static CarPrototype getPrototype(String model) {
        CarPrototype carPrototype = carPrototypes.get(model);
        if (carPrototype != null) {
            return carPrototype.clone();
        }
        return null;
    }
}
