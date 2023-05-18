package learn_design_patterns.creational.builder.has_interface;

public class Application {

    public static void main(String[] args) {

        Car car = new CarBuilder().setName("Mercedes")
                                    .setColor("Black")
                                    .setNumSeats(4);

        System.out.println(car.getNumSeats());
        System.out.println(car.getName());
        System.out.println(car.getColor());
    }
}
