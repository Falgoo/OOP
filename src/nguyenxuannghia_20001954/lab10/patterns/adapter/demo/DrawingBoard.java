package nguyenxuannghia_20001954.lab10.patterns.adapter.demo;

public class DrawingBoard {
    private Shape shape;

    public DrawingBoard(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
