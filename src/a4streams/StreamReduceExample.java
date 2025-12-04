package a4streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(performMultiplication(integers));
        System.out.println("++++++");
        Optional<Integer> optional = performMultiplicationWithoutIdentity(integers);
        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        System.out.println("++++++");
        Optional<Integer> optional1 = performMultiplicationWithoutIdentity(integers1);
        System.out.println(optional1.isPresent());
        if(optional1.isPresent()){
            System.out.println(optional1.get());
        }


        System.out.println("+++++++++++++++++++++++++++");
        Optional<Student> studentOptional = getHighestGpaStudent();
        System.out.println(studentOptional.get());
    }

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                //the default value for multiplication is 1
                // 1*1=1
                //1*3=3
                //3*5=15
                //15*7=105
                .reduce(1,(a,b)->a*b);
    }
    //what if i don't give an identity value or default value?

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                .reduce((a,b)->a*b);
    }
  //using reduce to return the highest value
    public static Optional<Student> getHighestGpaStudent(){
     return    StudentDataBase.getAllStudents().stream()
             .reduce((s1,s2)-> (s1.getGpa()> s2.getGpa()) ? s1 : s2);
//                .reduce((s1,s2)->{
//                    if(s1.getGpa()>s2.getGpa()){
//                        return s1;
//                    }else{
//                        return s2;
//                    }
//                });
    }
}
