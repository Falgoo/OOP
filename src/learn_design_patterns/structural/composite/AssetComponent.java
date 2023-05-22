package learn_design_patterns.structural.composite;

public abstract class AssetComponent {

    public abstract String getDescription();
    public abstract double getTotalValue();

    public void add(AssetComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(AssetComponent component) {
        throw new UnsupportedOperationException();
    }
}
