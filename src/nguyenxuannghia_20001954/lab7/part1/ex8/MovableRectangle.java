package nguyenxuannghia_20001954.lab7.part1.ex8;

public class MovableRectangle implements Movable {

    final private MovablePoint topLeft;
    final private MovablePoint botRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        botRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle[" +
                "topLeft = " + topLeft +
                ", bottomRight = " + botRight +
                ']';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        botRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        botRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        botRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        botRight.moveRight();
    }
}
