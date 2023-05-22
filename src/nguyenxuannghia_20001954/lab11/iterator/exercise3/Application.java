package nguyenxuannghia_20001954.lab11.iterator.exercise3;

public class Application {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("John"));
        studentList.addStudent(new Student("Jane"));
        studentList.addStudent(new Student("Mike"));

        Iterator<Student> iterator = studentList.createIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName());
        }
    }
}
