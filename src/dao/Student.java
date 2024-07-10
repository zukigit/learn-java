package dao;

public class Student {
    String name;
    int age;

    public static String getClassName() {
        return "Student";
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
}
