package nguyenxuannghia_20001954.lab8.part4.ex1;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie movie) {
        if (this.year < movie.year) {
            return -1;
        } else if (this.year == movie.year) {
            return 0;
        } else {
            return 1;
        }
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
