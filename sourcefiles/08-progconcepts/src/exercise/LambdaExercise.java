package exercise;

import java.util.Collection;
import java.util.Iterator;

public class LambdaExercise {
    public static void main(String[] args) {

    }

    private static void printCollectionWithIterator(Collection c) {
        if(c == null) throw new IllegalArgumentException();
        Iterator iter = c.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static void printCollectionWithStream(Collection c) {
        if(c == null) throw new IllegalArgumentException();
        c.stream().forEach(System.out::println);
    }
}
