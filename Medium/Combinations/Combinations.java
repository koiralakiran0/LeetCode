package Combinations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(Combinations.combine(2, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new List<List<Integer>>();
        List<List<Integer>> list = comine2(n, k, result);
        return result;
    }

    public static void combine2(int n, int k, List<List<Integer>> list) {
        if (n == k){
            list.add(Stream.iterate(1, j -> j+1).limit(k).collect(Collectors.toList()));
        }
    }
}
