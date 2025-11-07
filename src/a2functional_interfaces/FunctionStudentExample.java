package a2functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    public static void main(String[] args) {
        System.out.println("result : " + studentFunction.apply(StudentDataBase.getAllStudents()));
    }

    static Function<List<Student>, Map<String,Double>> studentFunction = studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();

        studentList.forEach(student -> {
            if(PredicateStudentExample.p2.test(student)) {
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    };

}
