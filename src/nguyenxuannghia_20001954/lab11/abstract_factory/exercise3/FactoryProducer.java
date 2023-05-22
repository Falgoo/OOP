package nguyenxuannghia_20001954.lab11.abstract_factory.exercise3;

public class FactoryProducer {

    public AbstractFactory getRoundedShapeFactory() {
        return new RoundedShapeFactory();
    }

    public AbstractFactory getShapeFactory() {
        return new ShapeFactory();
    }

}
