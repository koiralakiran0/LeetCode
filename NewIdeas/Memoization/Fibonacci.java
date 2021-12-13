import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        //trying to return nth fibonacci's number
        int n = 28;
        System.out.print( fib(n) );
    }

    private static int fib(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        return fib(num, map);
    }

    private static int fib (int num, Map<Integer, Integer> map) {
        if (map.containsKey(num)) return map.get(num);
        if (num == 2) return 1; 
        if (num == 1) return 1;
        int fibNum =  fib(num-1, map) + fib(num-2, map);
        map.put(num, fibNum);
        return fibNum;
    }
}
