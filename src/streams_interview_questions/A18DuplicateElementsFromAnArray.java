package streams_interview_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A18DuplicateElementsFromAnArray {
    /* How do you extract duplicate elements from an array? */

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements = new HashSet<>();
       Set<Integer> result = listOfIntegers.stream().filter(i->!uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println(result);
    }
}
