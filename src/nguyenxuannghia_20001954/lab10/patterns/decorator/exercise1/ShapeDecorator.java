package nguyenxuannghia_20001954.lab10.patterns.decorator.exercise1;

public abstract class ShapeDecorator implements Shape {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {

    }
}
