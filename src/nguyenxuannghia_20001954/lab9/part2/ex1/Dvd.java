package nguyenxuannghia_20001954.lab9.part2.ex1;

public class Dvd extends Item {

    private final int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Dvd[" + "duration=" + duration
                + ", title=" + super.getTitle() + "\""
                + ", year=" + super.getYear() + "]";
    }
}
