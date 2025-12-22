package streams_interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A6Max3Min3 {
    /* How do you get three maximum numbers and three minimum numbers from the given list of integers? */
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("min value ");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("max value");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
