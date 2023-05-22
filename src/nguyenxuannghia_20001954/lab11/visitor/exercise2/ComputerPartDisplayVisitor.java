package nguyenxuannghia_20001954.lab11.visitor.exercise2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor");
    }
}
