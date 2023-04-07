package nguyenxuannghia_20001954_lab7.part1.ex7;

public class Dog extends Animal {

    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooof!");
    }
}
