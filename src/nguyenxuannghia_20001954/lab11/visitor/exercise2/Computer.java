package nguyenxuannghia_20001954.lab11.visitor.exercise2;

public class Computer implements ComputerPart {

    private ComputerPart parts[];

    public Computer() {
        parts = new ComputerPart[]{
                new Keyboard(),
                new Mouse(),
                new Monitor()};
    }

    public ComputerPart[] getParts() {
        return parts;
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
