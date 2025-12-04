package a4streams;

import data.Student;
import data.StudentDataBase;

import java.util.Collection;
import java.util.List;

public class StreamsFlatMapExample {

    //.flatMap() is good for stream<List<String>>

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() // stream<string> with distinct for unique values
                .sorted() // default ascending order
                .toList();

        return studentActivities;
    }

    //count and distinct
    public static long printStudentActivitiesCount(){
        long studentActivitiesCount = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() // stream<string> with distinct for unique values
                .count();

        return studentActivitiesCount;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println("+++++++++++++++");
        System.out.println(printStudentActivitiesCount());
    }
}
