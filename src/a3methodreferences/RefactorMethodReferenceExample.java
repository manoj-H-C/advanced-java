package a3methodreferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Student> p1 = (s)-> s.getGradeLevel() >=3;
        System.out.println(p1.test(StudentDataBase.supplier.get()));
        //converting above lambda expression to method reference

        Predicate<Student> p2= RefactorMethodReferenceExample::greaterThanGradeLevel;
        System.out.println(p2.test(StudentDataBase.supplier.get()));

    }

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel() >=3;
    }
}
