package nguyenxuannghia_20001954_lab7.part1.ex7;

public class BigDog extends Dog {

    @Override
    public void greeting() {
        System.out.println("Wooow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooow!");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooooooow!");
    }
}
