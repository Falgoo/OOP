package nguyenxuannghia_20001954_lab6.part1.ex5;

public class TestMain {

    public static void main(String[] args) {
        Mammal mammal = new Mammal("elephant");
        System.out.println(mammal);

        Cat cat = new Cat("cat");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("dog 1");
        System.out.println(dog1);
        Dog dog2 = new Dog("dog 2");
        System.out.println(dog2);
        dog1.greets();
        dog1.greets(dog2);
    }
}
