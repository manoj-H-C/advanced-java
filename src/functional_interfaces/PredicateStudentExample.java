package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    public static void main(String[] args) {
        filterStudentsByGrade();
        filerStudentByGpa();
    }

    static Predicate<Student> p1 = (s)-> s.getGradeLevel() >=3;
    static Predicate<Student> p2 = (s)-> s.getGpa() >=3.9;

    /* if student is grade is 3 or above it prints their details */
    public static void filterStudentsByGrade(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    /* if student gpa is 3.9 or above it prints their details  */
    public static void filerStudentByGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }
}
