package a4streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        Predicate<Student> predicate1 = student -> student.getGradeLevel()>=3;
        Predicate<Student> predicate2 = student-> student.getGpa()>=3.9;


        Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println(student)) //for debugging at different operations
                .filter(predicate1.and(predicate2))  //or i can using another filter //Stream<Students>
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); //<Map>

        System.out.println(stringListMap);
        System.out.println("+++++++++++++++++++");
        //practice
        Map<String, List<String>> listMap = StudentDataBase.getAllStudents().stream()
                .filter(predicate1.and(predicate2))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(listMap);
    }
}
