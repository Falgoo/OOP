package nguyenxuannghia_20001954.lab11.bridge.exercise3;

public class Window implements Platform {

    private final Shape shape;

    public Window(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void drawShape() {
        System.out.println("Draw shape on Window");
        shape.draw();
    }
}
