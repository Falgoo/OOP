package nguyenxuannghia_20001954.lab9.part2.ex3;

public class ArrayPoly extends AbstractPoly {

    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficient() {
        return coefficients;
    }

}
