package learn_design_patterns.behaviors.visitor;

public class Application {

    public static void main(String[] args) {
            Shape circle = new Circle(5.0);
            Shape rectangle = new Rectangle(3.0, 4.0);

            ShapeVisitor shapeCalculator = new ShapeCalculate();

            circle.accept(shapeCalculator);
            rectangle.accept(shapeCalculator);
    }
}
