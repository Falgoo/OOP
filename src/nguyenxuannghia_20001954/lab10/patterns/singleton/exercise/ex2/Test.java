package nguyenxuannghia_20001954.lab10.patterns.singleton.exercise.ex2;

public class Test {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        System.out.println(db1);

        Database db2 = Database.getInstance();
        System.out.println(db2);
    }
}
