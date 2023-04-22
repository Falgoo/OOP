package nguyenxuannghia_20001954.lab9.part2.ex2;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String lastName;
    private String phone;
    private double average;

    public Student(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public Student(String name, String lastName, String phone, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        if (average > s.average) {
            return 1;
        } else if (average < s.average) {
            return -1;
        }

        int lastNameComparison = lastName.compareTo(s.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return name.compareTo(s.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phone, average);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                ']';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public double getAverage() {
        return average;
    }
}
