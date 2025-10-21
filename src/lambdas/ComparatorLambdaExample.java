package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //old approach
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("result of comparator " + comparator.compare(3,2));

        //java 8

        Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);

        System.out.println("result of comparator1 " + comparator1.compare(2,3));
    }
}
