package nguyenxuannghia_20001954.lab6.part1.ex2;

public class TestMain {

    public static void main(String[] args) {

        Person person = new Person("Nghia", "Hanoi");
        System.out.println("\nPerson's name: " + person.getName());
        System.out.println("Person's address: " + person.getAddress());
        System.out.println("Info: " + person);

        Student student = new Student("Nghia", "Hanoi", "CS", 2022, 100);
        System.out.println("\nStudent's program: " + student.getProgram());
        System.out.println("Student's year: " + student.getYear());
        System.out.println("Student's fee: " + student.getFee());
        System.out.println("Info: " + student);

        Staff staff = new Staff("Nghia", "Hanoi", "HUS", 200);
        System.out.println("\nStaff's school: " + staff.getSchool());
        System.out.println("Staff's pay: " + staff.getPay());
        System.out.println("Info: " + staff);
    }
}
