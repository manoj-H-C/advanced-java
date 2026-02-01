package streams_interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class A1SeparateOddAndEven {

/* Given a list of integers, separate odd and even numbers? */

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//        Map<Boolean, List<Integer>> oddEvenList = listOfIntegers.stream().collect(Collectors.partitioningBy(i-> i%2==0));
//
//        for(var entry : oddEvenList.entrySet()){
//            System.out.println("--------------------");
//            if(entry.getKey()){
//                System.out.println("even numbers...");
//            }else {
//                System.out.println("odd numbers...");
//            }
//            List<Integer> list = entry.getValue();
//            for(int num : list){
//                System.out.println(num);
//            }
//        }
        Map<String, List<Integer>> oddEvenList = listOfIntegers.stream().collect(Collectors.groupingBy(i-> i%2==0 ? "Even" : "Odd"));

        for(var entry : oddEvenList.entrySet()){
            System.out.println("--------------------");
            System.out.println(entry.getKey() + " numbers...");
            List<Integer> list = entry.getValue();
            for(int num : list){
                System.out.println(num);
            }
        }
    }
}
