package learn_design_patterns.creational.factory_method.factory;

import java.util.Random;
import learn_design_patterns.creational.factory_method.seed.Seed;
import learn_design_patterns.creational.factory_method.seed.Logan;
import learn_design_patterns.creational.factory_method.seed.Orange;

public class SongCLFactory implements SeedFactory {

    @Override
    public Seed chooseSeed() {
        Random random = new Random();
        return switch (random.nextInt(2)) {
            case 0 -> new Orange();
            case 1 -> new Logan();
            default -> null;
        };
    }
}
