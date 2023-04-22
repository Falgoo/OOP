package nguyenxuannghia_20001954.lab9.part2.ex2;

public interface PhoneBook {

    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastName(String lastName);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
