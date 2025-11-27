package a3methodreferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    public static void main(String[] args) {
        Consumer<Student> c1= (student) -> System.out.println(student);
        StudentDataBase.getAllStudents().forEach(c1);

        Student student1 = new Student();

        System.out.println("className::methodName");
        Consumer<Student> c2 = System.out::println;
        StudentDataBase.getAllStudents().forEach(c2);
        Consumer<Student> c3 = Student::printAllActivities;
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
