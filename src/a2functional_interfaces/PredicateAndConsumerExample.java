package a2functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }

    /* it's an example of both both predicate and
     consumer functional interface working together*/

     Predicate<Student> p1 = (s)-> s.getGradeLevel() >=3;
     Predicate<Student> p2 = (s)-> s.getGpa() >=3.9;

     // instead of using 2 different conditions using predicate i can combine them using bi predicate

    BiPredicate<Integer, Double> biPredicate = (gradeLvl,gpa) -> {

        return gradeLvl>=3 && gpa >= 3.9;
    };

     BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
          System.out.println(name + " :" + activities);
     };

     Consumer<Student> consumerList = (student -> {
//         if(p1.and(p2).test(student)){
         if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
             biConsumer.accept(student.getName(), student.getActivities());
         }
     });

     public void printNameAndActivities(List<Student> studentList){
         studentList.forEach(consumerList);
     }

}
