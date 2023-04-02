package nguyenxuannghia_20001954_lab5.part2.ex7;

public class MyLine {

    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    public int[] getEndXY() {
        return new int[] {begin.getX(), begin.getY()};
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int xDiff = Math.abs(begin.getX() - end.getX());
        int yDiff = Math.abs(begin.getY() - end.getY());
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[begin = " + begin + ", end = " + end + "]";
    }
}
