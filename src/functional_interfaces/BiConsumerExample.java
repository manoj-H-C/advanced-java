package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    /* taking 2 i/p parameters and returns nothing  */
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b)-> {
            System.out.println("a :" +a + " b: "+ b);
        };
        biConsumer.accept("java-7", "java-8");

        //multiply
        BiConsumer<Integer,Integer> multiply = (a,b) ->{
            System.out.println("multiply : " + (a*b));
        };
        // multiply.accept(3,6);

        BiConsumer<Integer,Integer> division = (a,b) ->{
            System.out.println("division : " + (a/b));
        };
        //multiply.accept(30,5);

        multiply.andThen(division).accept(10,5);

        nameAndActivities();

    }

    public static void nameAndActivities(){
        System.out.println("inside nameAndActivities method");
        BiConsumer<String,List<String>> biConsumer = (name, activities)->{
            System.out.println("name :" + name + "  activities :" + activities);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getActivities().contains("swimming")){
                biConsumer.accept(student.getName(), student.getActivities());
            }
        });

    }
}
