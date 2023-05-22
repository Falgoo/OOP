package nguyenxuannghia_20001954.lab11.visitor.exercise1;

public interface Visitor {

    void visit(BusinessBook book);
    void visit(DesignPatternBook book);
    void visit(JavaCoreBook book);
}
