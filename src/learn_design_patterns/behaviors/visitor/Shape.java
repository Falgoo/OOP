package learn_design_patterns.behaviors.visitor;

public interface Shape {
    void accept(ShapeVisitor shapeVisitor);
}
