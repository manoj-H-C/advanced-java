package a2functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println("------------------------");
        System.out.println(listSupplier.get());
    }

    /* takes no input parameter but returns one output */

    static Supplier<Student> supplier = () ->  new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    static Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
}
