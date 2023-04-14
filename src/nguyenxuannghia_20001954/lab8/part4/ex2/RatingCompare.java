package nguyenxuannghia_20001954.lab8.part4.ex2;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating());
    }
}