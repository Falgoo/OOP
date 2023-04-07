package nguyenxuannghia_20001954_lab7.part1.ex6;

public class TestMain {

    public static void main(String[] args) {

        Cat cat1 = new Cat("hello kitty");
        cat1.greets();
        Dog dog1 = new Dog("Black");
        dog1.greets();
        BigDog bigDog1 = new BigDog("white");
        bigDog1.greets();
        System.out.println();

        Animal animal1 = new Cat("hello kitty");
        animal1.greets();
        Animal animal2 = new Dog("Black");
        animal2.greets();
        Animal animal3 = new BigDog("White");
        animal3.greets();
        System.out.println();

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal1;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
