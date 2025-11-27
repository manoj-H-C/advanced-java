package a4contructor_reference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("ABC"));
    }

    //empty constructor
   static Supplier<Student> studentSupplier = Student::new;

    //constructor with one parameter
    static Function<String,Student> studentFunction = Student::new;
}
