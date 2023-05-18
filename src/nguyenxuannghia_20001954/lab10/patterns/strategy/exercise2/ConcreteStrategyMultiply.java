package nguyenxuannghia_20001954.lab10.patterns.strategy.exercise2;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
