import dao.Student;

public class App {
    public static void main(String[] args) {
        Student student = new Student("zuki", 23);
        System.out.printf("Hello, World!, %s\n", student.name);
    }
}
