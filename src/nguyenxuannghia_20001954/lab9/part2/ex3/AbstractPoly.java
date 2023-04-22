package nguyenxuannghia_20001954.lab9.part2.ex3;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {

    double[] derive() {
        double[] polyCoeff = this.coefficient();
        double[] polyDerive = new double[polyCoeff.length - 1];

        for (int i = 0; i < polyDerive.length; i++) {
            polyDerive[i] = polyCoeff[i+1] * (i+1);
        }

        return polyDerive;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Poly poly = (Poly) obj;
        if (this.degree() != poly.degree()) {
            return false;
        }

        for (int i = 0; i < this.degree(); i++) {
            if (Double.compare(this.coefficient(i), (poly.coefficient(i))) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficient());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.coefficient(0) + " + ");

        if (this.degree() > 1) {
            for (int i = 1; i < this.degree(); i++) {

                if (i == this.degree() - 1) {
                    stringBuilder.append(this.coefficient(i) + "x^" + i);
                } else {
                    stringBuilder.append(this.coefficient(i) + "x^" + i + " + ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
