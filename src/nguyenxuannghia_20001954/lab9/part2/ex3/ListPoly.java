package nguyenxuannghia_20001954.lab9.part2.ex3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ListPoly extends AbstractPoly {

    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = DoubleStream.of(coeffs).boxed().collect(Collectors.toList());
    }

    @Override
    public int degree() {
        return coefficients.size();
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficient() {
        double[] coeff = new double[coefficients.size()];

        for (int i = 0; i < coefficients.size(); i++) {
            coeff[i] = coefficients.get(i);
        }
        return coeff;
    }
}
