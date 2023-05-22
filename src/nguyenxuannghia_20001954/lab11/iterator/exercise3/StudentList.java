package nguyenxuannghia_20001954.lab11.iterator.exercise3;

import java.util.ArrayList;
import java.util.List;

public class StudentList implements StudentCollection {

    private List<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public Iterator<Student> createIterator() {
        return new StudentIterator(students.toArray(new Student[0]));
    }
}
