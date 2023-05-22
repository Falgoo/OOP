package nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory;

import java.util.Random;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Coffee;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Rubber;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Seed;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Tieu;

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
