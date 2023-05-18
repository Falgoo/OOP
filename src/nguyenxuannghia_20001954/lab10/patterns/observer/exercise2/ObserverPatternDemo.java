package nguyenxuannghia_20001954.lab10.patterns.observer.exercise2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        System.out.println("Convert decimal 1234: ");
        subject.setState(1234);
        System.out.println(binaryObserver);
        System.out.println(hexaObserver);
        System.out.println(octalObserver);

        System.out.println("Conver decimal 5689: ");
        subject.setState(5689);
        System.out.println(binaryObserver);
        System.out.println(hexaObserver);
        System.out.println(octalObserver);
    }
}
