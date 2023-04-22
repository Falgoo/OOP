package nguyenxuannghia_20001954.lab9.part2.ex2;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

    private final ArrayList<Student> phoneBook;

    public PhoneBookList(ArrayList<Student> phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                phoneBook.remove(i);
            }
        }
    }
}
