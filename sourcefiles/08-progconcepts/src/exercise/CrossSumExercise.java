package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CrossSumExercise {
    public static void main(String[] args) {
        System.out.println(crossSum(1337));
    }

    private static int crossSum(int i) {
        if(i < 0) i = -i;
        if(i%10 == i) return i;
        return i%10 + crossSum(i/10);
    }
}
