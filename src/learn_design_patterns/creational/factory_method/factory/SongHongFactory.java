package learn_design_patterns.creational.factory_method.factory;

import java.util.Random;
import learn_design_patterns.creational.factory_method.seed.Seed;
import learn_design_patterns.creational.factory_method.seed.Logan;
import learn_design_patterns.creational.factory_method.seed.Orange;
import learn_design_patterns.creational.factory_method.seed.Rubber;

public class SongHongFactory implements SeedFactory {

    @Override
    public Seed chooseSeed() {
        Random random = new Random();
        return switch (random.nextInt(3)) {
            case 0 -> new Rubber();
            case 1 -> new Logan();
            case 2 -> new Orange();
            default -> null;
        };
    }
}
