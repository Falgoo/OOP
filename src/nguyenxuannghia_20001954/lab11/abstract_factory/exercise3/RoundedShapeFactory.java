package nguyenxuannghia_20001954.lab11.abstract_factory.exercise3;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape createRectangle() {
        return new RoundedRectangle();
    }

    @Override
    public Shape createSquare() {
        return new RoundedSquare();
    }
}
