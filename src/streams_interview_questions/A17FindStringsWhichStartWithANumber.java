package streams_interview_questions;

import java.util.Arrays;
import java.util.List;

public class A17FindStringsWhichStartWithANumber {
    /* Given a list of strings, find out those strings which start with a number? */
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> result =   listOfStrings.stream().filter(i-> Character.isDigit(i.charAt(0))).toList();
        System.out.println(result);
    }
}
