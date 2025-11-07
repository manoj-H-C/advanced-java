package a2functional_interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        System.out.println("result is :" + function.apply("java8"));
        //in andThen() function runs first then someString
        System.out.println("result for andThen : " + function.andThen(someString).apply("java8"));
        //in compose() someString runs first and then function
        // the parameter inside compose has first priority
        System.out.println("result for compose : " + function.compose(someString).apply("java8"));

        System.out.println("printConcat method : " + printConcat("hello ".trim()));
    }

   static Function<String, String> function = (name)-> name.toUpperCase();
   static Function<String, String> someString = name -> name.toUpperCase().concat("default");

   public static String printConcat(String str){
       return someString.apply(str);
   }

}
