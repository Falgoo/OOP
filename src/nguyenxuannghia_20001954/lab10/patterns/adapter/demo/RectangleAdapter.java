package nguyenxuannghia_20001954.lab10.patterns.adapter.demo;

public class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter() {
        rectangle = new Rectangle();
    }

    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}
