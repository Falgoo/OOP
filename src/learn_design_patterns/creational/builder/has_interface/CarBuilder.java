package learn_design_patterns.creational.builder.has_interface;

public class CarBuilder implements Car {

    private String color;
    private int numSeats;
    private String name;

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setNumSeats(int numSeats) {
        this.numSeats = numSeats;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getNumSeats() {
        return numSeats;
    }
}
