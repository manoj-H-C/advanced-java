package streams_interview_questions;

import java.util.Arrays;
import java.util.List;

public class A12CommonElementsBetweenArray {
    /*  How do you find common elements between two arrays? */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

      List<Integer> result =   list1.stream().filter(list2::contains).toList();
        System.out.println(result);
    }
}
