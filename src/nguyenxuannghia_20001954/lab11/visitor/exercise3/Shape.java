package nguyenxuannghia_20001954.lab11.visitor.exercise3;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor visitor);
}
