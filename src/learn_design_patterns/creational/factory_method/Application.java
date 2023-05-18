package learn_design_patterns.creational.factory_method;

import learn_design_patterns.creational.factory_method.factory.SeedFactory;
import learn_design_patterns.creational.factory_method.factory.SongCLFactory;
import learn_design_patterns.creational.factory_method.factory.SongHongFactory;
import learn_design_patterns.creational.factory_method.factory.TayNguyenFactory;
import learn_design_patterns.creational.factory_method.seed.Seed;

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
