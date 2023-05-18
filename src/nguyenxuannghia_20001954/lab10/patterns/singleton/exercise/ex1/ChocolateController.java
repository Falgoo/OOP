package nguyenxuannghia_20001954.lab10.patterns.singleton.exercise.ex1;

public class ChocolateController {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
