package nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory;

import java.util.Random;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Logan;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Orange;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Rubber;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Seed;

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
