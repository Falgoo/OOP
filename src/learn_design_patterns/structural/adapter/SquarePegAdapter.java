package learn_design_patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

    SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
