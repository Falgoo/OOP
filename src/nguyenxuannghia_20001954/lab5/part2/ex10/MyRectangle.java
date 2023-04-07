package nguyenxuannghia_20001954.lab5.part2.ex10;

public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint botRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.botRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getTopRight() {
        return new MyPoint(botRight.getX(), topLeft.getY());
    }

    public MyPoint getBotLeft() {
        return new MyPoint(topLeft.getX(), botRight.getY());
    }

    public MyPoint getBotRight() {
        return botRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                "topLeft = " + topLeft +
                ", botRight = " + botRight +
                ']';
    }

    public double getArea() {
        return topLeft.distance(getTopRight())
                * topLeft.distance(getBotLeft());
    }

    public double getPerimeter() {
        return 2 * (topLeft.distance(getTopRight())
                + topLeft.distance(getBotLeft()));
    }
}
