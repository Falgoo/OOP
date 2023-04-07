package nguyenxuannghia_20001954_lab7.part1.ex4;

public class TestMain {

    public static void main(String[] args) {
        Movable movableCircle = new MovableCircle(1,2,2,3,5);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}
