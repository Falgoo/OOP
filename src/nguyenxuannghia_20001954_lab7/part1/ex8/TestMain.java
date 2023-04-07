package nguyenxuannghia_20001954_lab7.part1.ex8;

public class TestMain {

    public static void main(String[] args) {
        Movable movableP = new MovablePoint( 5,6, 10,15);
        System.out.println(movableP);
        movableP.moveLeft();
        System.out.println(movableP);

        Movable movableC = new MovableCircle(4, 2, 4, 4, 5);
        System.out.println(movableC);
        movableC.moveRight();
        System.out.println(movableC);

        Movable movableR = new MovableRectangle(0, 1, 5, 4, 5, 5);
        System.out.println(movableR);
        movableR.moveDown();
        System.out.println(movableR);
    }
}
