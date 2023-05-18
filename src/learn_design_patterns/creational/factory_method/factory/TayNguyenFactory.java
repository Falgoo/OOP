package learn_design_patterns.creational.factory_method.factory;

import java.util.Random;
import learn_design_patterns.creational.factory_method.seed.Seed;
import learn_design_patterns.creational.factory_method.seed.Coffee;
import learn_design_patterns.creational.factory_method.seed.Rubber;
import learn_design_patterns.creational.factory_method.seed.Tieu;

public class TayNguyenFactory implements SeedFactory {

    @Override
    public Seed chooseSeed() {
        Random random = new Random();
        return switch (random.nextInt(3)) {
            case 0 -> new Coffee();
            case 1 -> new Tieu();
            case 2 -> new Rubber();
            default -> null;
        };
    }
}
