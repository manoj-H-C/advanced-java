package a4streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamsMapExample {
    //.map is best when the data is stream<String>.

    public static List<String> namesList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //map(student -> student.getName())
                .map(String::toUpperCase)//map(name-> name.toUpperCase())
                .toList();
    }

    public static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //map(student -> student.getName())
                .map(String::toUpperCase)//map(name-> name.toUpperCase())
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(namesSet());
    }
}
