import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        /* Imperative style of programming -- how style of programming*/
        int sum=0;
        for(int i= 0; i<=100; i++){
            sum+=i;
        }
        System.out.println("sum by imperative style " + sum);

        /* Declarative style of programming -- what style of programming*/
        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("sum by declarative style " + sum1);

        /* Remove duplicates */
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,6,7,7,8,8,9,0,0);

        /*imperative*/
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer num : integerList){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }

        System.out.println("uniqueList" + uniqueList);

        /*declarative*/
       List<Integer> uniqueList1 =  integerList.stream().distinct().toList();

        System.out.println("uniqueList1" + uniqueList1);
    }
}
