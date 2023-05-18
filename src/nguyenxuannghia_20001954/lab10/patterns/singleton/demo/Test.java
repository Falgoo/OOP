package nguyenxuannghia_20001954.lab10.patterns.singleton.demo;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("First log message");
        logger.log("Second log message");
    }
}
