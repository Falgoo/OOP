package nguyenxuannghia_20001954_lab7.part1.ex3;

public class TestMain {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 6, 10, 5);
        System.out.println("Point: " + point);
        point.moveUp();
        System.out.println("Move up: " + point);
        point.moveDown();
        System.out.println("Move down: " + point);
        point.moveLeft();
        System.out.println("Move left: " + point);
        point.moveRight();
        System.out.println("Move right: " + point);
    }
}
