package nguyenxuannghia_20001954_lab6.part1.ex4;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "[Shape[Rectangle[Square[" +
                "color='" + this.getColor() + '\'' +
                ", filled=" + this.isFilled() +
                "], width=" + this.getSide() +
                ", length=" + this.getSide() +
                "]]";
    }
}
