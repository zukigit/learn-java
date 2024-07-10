import dao.Student;

public class App {
    public static void main(String[] args) {
        System.out.println(Student.getClassName());
        Student student = new Student("zuki", 23);
        System.out.printf("Hello, World!, %s\n", student.getName());
    }
}
