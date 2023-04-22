package nguyenxuannghia_20001954.lab9.part2.ex1;

public class Library {

    private final Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        int longestIndex = 0;
        long max = rents[0].getEnd().getTime() - rents[0].getBegin().getTime();

        for (int i = 0; i < rents.length; i++) {
            long time = rents[i].getEnd().getTime() - rents[i].getBegin().getTime();

            if (time > max) {
                max = time;
                longestIndex = i;
            }
        }
        return rents[longestIndex];
    }
}
