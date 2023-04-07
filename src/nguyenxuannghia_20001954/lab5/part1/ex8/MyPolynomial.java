package nguyenxuannghia_20001954.lab5.part1.ex8;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        for (int index = this.getDegree() ; index >= 0; index--) {
            build.append(coeffs[index]).append(" x^").append(index).append(" + ");
        }
        build.setLength(build.length() - 6);
        return build.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int index = this.getDegree(); index > 0; index--) {
            polyValue = polyValue * x + coeffs[index];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree() + 1, right.getDegree() + 1);
        double[] polyData = new double[maxDegree];

        for (int index = 0 ; index <= this.getDegree(); index++) {
            polyData[index] += this.coeffs[index];
        }

        for (int index = 0 ; index <= right.getDegree(); index++) {
            polyData[index] += right.coeffs[index];
        }
        return new MyPolynomial(polyData);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiplyDegree = this.getDegree() + right.getDegree() + 1;
        double[] multiplyPolyData = new double[multiplyDegree];

        for (int index = 0 ; index <= this.getDegree(); index++) {
            for (int num = 0 ; num <= right.getDegree(); num++) {
                multiplyPolyData[index + num] += this.coeffs[index] * right.coeffs[num];
            }
        }
        return new MyPolynomial(multiplyPolyData);
    }
}
