package nguyenxuannghia_20001954.lab11.abstract_factory.exercise3;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory abstractFactory = factoryProducer.getShapeFactory();
        Shape shape1 = abstractFactory.createRectangle();
        shape1.draw();
        Shape shape2 = abstractFactory.createSquare();
        shape2.draw();

        AbstractFactory abstractFactory2 = factoryProducer.getRoundedShapeFactory();
        Shape shape3 = abstractFactory2.createRectangle();
        shape3.draw();
        Shape shape4 = abstractFactory2.createSquare();
        shape4.draw();
    }
}
