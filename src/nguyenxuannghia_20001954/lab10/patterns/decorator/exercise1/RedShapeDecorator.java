package nguyenxuannghia_20001954.lab10.patterns.decorator.exercise1;

public class RedShapeDecorator extends ShapeDecorator {
    Shape shape;

    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.print(" Red Border");
    }
}
