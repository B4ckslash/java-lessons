package lambdas;

public class LambdaExample {
    public static void main(String[] args) {
       String s = "Peter";
       //the old way
       s = doStuff(s, new Function<String, String>() { //"implements" the method apply(T t) right in the Method call by creating a so-called anonymous class
           @Override
           public String apply(String s) {
               return s.replace('e', '@');
           }
       });

       System.out.println(s); //should print P@t@r

       //the new way with lambdas
        s = doStuff(s, a -> a.replace('@', 'e'));
        //lambdas basically serve as a built-in shorthand for implementing an interface or abstract class parameter which
        //only has one method to be overridden, in this case this lambda is implementing the method apply(T t) of the Function interface

        System.out.println(s); //should print Peter
    }

    private static String doStuff(String s, Function<String, String> function) {
        return function.apply(s); // applies Function to s
    }
}
