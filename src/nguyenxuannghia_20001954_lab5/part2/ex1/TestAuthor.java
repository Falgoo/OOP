package nguyenxuannghia_20001954_lab5.part2.ex1;

public class TestAuthor {

    public static void main(String[] args) {
        //Author class test
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nothere.com");
        System.out.println("Name is: " + ahTeck.getName());
        System.out.println("Email is: " + ahTeck.getEmail());
        System.out.println("Gender is: " + ahTeck.getGender());
    }
}
