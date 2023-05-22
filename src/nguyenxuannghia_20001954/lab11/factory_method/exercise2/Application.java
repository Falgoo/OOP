package nguyenxuannghia_20001954.lab11.factory_method.exercise2;

import nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory.SeedFactory;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory.SongCLFactory;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory.SongHongFactory;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.factory.TayNguyenFactory;
import nguyenxuannghia_20001954.lab11.factory_method.exercise2.seed.Seed;

public class Application {

    public static void main(String[] args) {
        System.out.println("Chọn giống ở Tây Nguyên");
        SeedFactory tayNguyenFactory = new TayNguyenFactory();

        for (int i = 0; i < 12; i++) {
            Seed seed = tayNguyenFactory.chooseSeed();
            System.out.println(seed.showSeedName());
        }

        System.out.println("\nChọn giống ở SCL");
        SeedFactory sCLFactory = new SongCLFactory();

        for (int i = 0; i < 12; i++) {
            Seed seed = sCLFactory.chooseSeed();
            System.out.println(seed.showSeedName());
        }

        System.out.println("\nChọn giống ở Song Hong");
        SeedFactory hongFactory = new SongHongFactory();

        for (int i = 0; i < 12; i++) {
            Seed seed = hongFactory.chooseSeed();
            System.out.println(seed.showSeedName());
        }

    }
}
