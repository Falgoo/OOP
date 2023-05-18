package nguyenxuannghia_20001954.lab10.patterns.observer.exercise2;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
        super.subject.attach(this);
    }

    @Override
    public void update() {
        this.result = convertDecToHex(super.subject.getState());
    }

    private String convertDecToHex(int decimal) {
        return Long.toOctalString((long) decimal);
    }
}
