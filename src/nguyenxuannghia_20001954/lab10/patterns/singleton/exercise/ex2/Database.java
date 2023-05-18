package nguyenxuannghia_20001954.lab10.patterns.singleton.exercise.ex2;

public class Database {
    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Database";
    }
}
