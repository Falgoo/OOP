package nguyenxuannghia_20001954.lab11.visitor.exercise1;

public class VisitorPatternExample {

    public static void main(String[] args) {
        Book book1 = new BusinessBook("NXB Giao duc");
        Book book2 = new JavaCoreBook("Core Java Volume 1 ");
        Book book3 = new DesignPatternBook("Head First Design Pattern");

        Visitor visitor = new VisitorImpl();
        book1.accept(visitor);
        System.out.println();
        book2.accept(visitor);
        System.out.println();
        book3.accept(visitor);
    }
}
