package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorExercise {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            strings.add("na");
        }
        strings.add("BATMAN!");
        Iterator<String> iter = strings.iterator();
        //TODO: print contents of strings list using the above Iterator
    }
}
