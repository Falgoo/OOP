package nguyenxuannghia_20001954.lab11.bridge.exercise3;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        Platform windows = new Window(square);
        Platform linux = new Linux(rectangle);

        windows.drawShape();
        linux.drawShape();
    }
}
