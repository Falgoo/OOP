package nguyenxuannghia_20001954.lab11.bridge.exercise1;

public abstract class Computer {

    OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void startup();

    public abstract void browseInternet(String url);

    public abstract boolean canMoveComputer();
}
