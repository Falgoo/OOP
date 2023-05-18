package nguyenxuannghia_20001954.lab10.patterns.adapter.demo;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape shape = new RectangleAdapter();

        DrawingBoard board = new DrawingBoard(shape);
        board.drawShape(); // Drawing a rectangle
    }
}
