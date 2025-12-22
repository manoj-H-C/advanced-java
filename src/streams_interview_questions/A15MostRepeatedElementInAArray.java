package streams_interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A15MostRepeatedElementInAArray {
    /*  How do you find the most repeated element in an array? */
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
       var elementCount =  listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       var mostFrequentElement = elementCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());

        System.out.println("Count : "+mostFrequentElement.getValue());
    }
}
