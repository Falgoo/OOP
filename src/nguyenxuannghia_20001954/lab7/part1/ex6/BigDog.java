package nguyenxuannghia_20001954.lab7.part1.ex6;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooooooow");
    }
}
