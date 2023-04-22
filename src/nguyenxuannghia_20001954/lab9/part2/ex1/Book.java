package nguyenxuannghia_20001954.lab9.part2.ex1;

public class Book extends Item {

    private final int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book[" + "pages=" + pages
                + ", title=" + super.getTitle() + "\""
                + ", year=" + super.getYear() + "]";
    }
}
