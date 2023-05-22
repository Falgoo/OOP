package learn_design_patterns.structural.adapter;

public class Application {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(100);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
