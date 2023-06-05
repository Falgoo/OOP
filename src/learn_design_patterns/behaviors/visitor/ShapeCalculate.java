package learn_design_patterns.behaviors.visitor;

public class ShapeCalculate implements ShapeVisitor {
    @Override
    public void visitorCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Calculating area of circle: " + area);
    }

    @Override
    public void visitorRectangle(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Calculating area of rectangle: " + area);
    }
}
