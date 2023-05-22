package nguyenxuannghia_20001954.lab11.builder.exercise2;

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

    @Override
    public String toString() {
        return "CarBuilder{" +
                "color='" + color + '\'' +
                ", numSeats=" + numSeats +
                ", name='" + name + '\'' +
                '}';
    }
}
