package nguyenxuannghia_20001954.lab9.part2.ex1;

public abstract class Item {

    private final String title;
    private final int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Item[" +
                "title='" + title + '\'' +
                ", year=" + year +
                "]";
    }
}
