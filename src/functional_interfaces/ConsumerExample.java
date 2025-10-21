package functional_interfaces;

import data.Student;
import data.StudentDTO;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    /* taking 1 i/p parameters and returns nothing  */
   static Consumer<Student> c3 = (student)-> System.out.println(student);
   static Consumer<Student> c4 = (student) -> System.out.print(student.getName());
   static Consumer<Student> c5 = (student) -> System.out.println(student.getActivities());

    public static void main(String[] args) {
        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        c1.accept("manoj");
        Consumer<Integer> c2 = (s)-> System.out.println(s.toString());
        c2.accept(1234);
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
        printNameAndActivitiesUsingConditionAndCustomDto();
    }

    public static void printStudents(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3);
    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c4.andThen(c5));  //consumer  chaining
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel() >=3 && student.getGpa()>=3.9){
                c4.andThen(c5).accept(student);
            }
        })); //conditional for each
    }

    //adding custom dto

    public static void printNameAndActivitiesUsingConditionAndCustomDto() {
        System.out.println("adding custom dto response +++++++");

        List<Student> studentList = StudentDataBase.getAllStudents();

        List<StudentDTO> dtoList = new ArrayList<>();

        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                StudentDTO dto = new StudentDTO();
                dto.setName(student.getName());
                dto.setActivities(student.getActivities());

                dtoList.add(dto); //
            }
        });

        // Print or use the DTO list
       // dtoList.forEach(studentDTO -> System.out.println(studentDTO));
        System.out.println(dtoList);
       // dtoList.forEach(System.out::println);
    }
}
