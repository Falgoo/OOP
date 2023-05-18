package nguyenxuannghia_20001954.lab10.patterns.observer.exercise2;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        super(subject);
        super.subject.attach(this);
    }

    @Override
    public void update() {
        this.result = convertDecToBin(super.subject.getState());
    }

    private String convertDecToBin(int decimal) {
        return Long.toBinaryString((long) decimal);
    }
}
