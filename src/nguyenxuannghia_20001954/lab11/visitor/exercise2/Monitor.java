package nguyenxuannghia_20001954.lab11.visitor.exercise2;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
