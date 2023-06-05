package learn_design_patterns.behaviors.visitor;

public interface ShapeVisitor {
    void visitorCircle(Circle circle);
    void visitorRectangle(Rectangle rectangle);
}
