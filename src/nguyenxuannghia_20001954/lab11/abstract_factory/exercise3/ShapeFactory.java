package nguyenxuannghia_20001954.lab11.abstract_factory.exercise3;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape createRectangle() {
        return new Rectangle();
    }

    @Override
    public Shape createSquare() {
        return new Square();
    }
}
