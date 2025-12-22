package streams_interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A10SortInIncreasingOfLength {
    /*  Given a list of strings, sort them according to increasing order of their length? */
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
       List<String> result =  listOfStrings.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(result);
    }
}
