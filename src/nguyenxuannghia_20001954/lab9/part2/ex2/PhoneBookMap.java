package nguyenxuannghia_20001954.lab9.part2.ex2;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {

    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook.values()) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
