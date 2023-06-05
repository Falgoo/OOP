package learn_design_patterns.behaviors.visitor;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visitorCircle(this);
    }
}
