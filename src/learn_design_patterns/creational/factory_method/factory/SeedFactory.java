package learn_design_patterns.creational.factory_method.factory;

import learn_design_patterns.creational.factory_method.seed.Seed;

public interface SeedFactory {

    Seed chooseSeed();
}
