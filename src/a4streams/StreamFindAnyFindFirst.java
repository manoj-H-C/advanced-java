package a4streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFindFirst {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()==3.5)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> anyStudent = findAnyStudent();
        anyStudent.ifPresent(System.out::println);
        System.out.println("++++++++++++++++");
        Optional<Student> firstStudent = findFirstStudent();
        firstStudent.ifPresent(System.out::println);
    }
}
