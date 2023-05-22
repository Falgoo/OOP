package nguyenxuannghia_20001954.lab11.iterator.exercise3;

import java.util.NoSuchElementException;

public class StudentIterator implements Iterator<Student> {
    private Student[] students;
    private int position;

    public StudentIterator(Student[] students) {
        this.students = students;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < students.length;
    }

    @Override
    public Student next() {
        if (hasNext()) {
            Student student = students[position];
            position++;
            return student;
        }
        throw new NoSuchElementException("No more elements in the collection.");
    }
}
