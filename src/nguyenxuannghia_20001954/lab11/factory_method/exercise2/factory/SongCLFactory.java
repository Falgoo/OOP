package nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory;

import java.util.Random;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Logan;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Orange;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Seed;

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
