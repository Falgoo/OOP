package nguyenxuannghia_20001954.lab10.patterns.decorator.exercise1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
    }
}
