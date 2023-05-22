package nguyenxuannghia_20001954.lab11.builder.exercise2;

public class Application {

    public static void main(String[] args) {

        Car car = new CarBuilder().setName("Mercedes")
                                    .setColor("Black")
                                    .setNumSeats(4);
        System.out.println(car);
    }
}
