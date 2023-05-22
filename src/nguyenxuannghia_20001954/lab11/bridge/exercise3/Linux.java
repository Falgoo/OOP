package nguyenxuannghia_20001954.lab11.bridge.exercise3;

public class Linux implements Platform {

    private final Shape shape;

    public Linux(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void drawShape() {
        System.out.println("Draw shape on Linux");
        shape.draw();
    }
}
