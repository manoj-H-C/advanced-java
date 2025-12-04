package a4streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {

    public static List<Student> sortedStudentsByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    public static List<Student> sortedStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();
    }

    public static List<Student> sortedStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();
    }

    public static void main(String[] args) {
        sortedStudentsByName().forEach(System.out::println);
        System.out.println("++++++");
        sortedStudentsByGpa().forEach(System.out::println);
        System.out.println("descending order of gpa :");
        sortedStudentsByGpaDesc().forEach(System.out::println);
    }
}
