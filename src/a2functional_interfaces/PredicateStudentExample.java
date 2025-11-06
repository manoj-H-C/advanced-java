package a2functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    public static void main(String[] args) {
        filterStudentsByGrade();
        filerStudentByGpa();
        filterStudentAnd();
        filterStudentOr();
        filterStudentNegate();
    }

    static Predicate<Student> p1 = (s)-> s.getGradeLevel() >=3;
    static Predicate<Student> p2 = (s)-> s.getGpa() >=3.9;

    /* if student is grade is 3 or above it prints their details */
    public static void filterStudentsByGrade(){
        System.out.println("filterStudentsByGrade method");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    /* if student gpa is 3.9 or above it prints their details  */
    public static void filerStudentByGpa(){
        System.out.println("filerStudentByGpa method");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    /* if i want to use multiple  conditions i can do the following */
    public static void filterStudentAnd(){
        System.out.println("filterStudentAnd method");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentOr(){
        System.out.println("filterStudentOr method");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    /* negate means basically which doesn't satisfy both conditions */
    public static void filterStudentNegate(){
        System.out.println("filterStudentNegate method");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }


}
