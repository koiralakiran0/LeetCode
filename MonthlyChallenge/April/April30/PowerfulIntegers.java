import java.util.ArrayList;
import java.util.List;

public class PowerfulIntegers {
    public static void main(String[] args) {
        SolutionPowerfulIntegers solution = new SolutionPowerfulIntegers();
        System.out.println(solution.powerfulIntegers(2,1,10));
    }
}

class SolutionPowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        if (bound < 1) return new ArrayList<>();
        List<Integer> combined = new ArrayList();
        List<Integer> xPowers = getIntegerList(x, bound);
        List<Integer> yPowers = getIntegerList(y, bound);
        
        int sum = 0;
        for (int xBound : xPowers) {
            for (int yBound: yPowers) {
                sum = xBound + yBound;
                if (sum <= bound && !combined.contains(sum)) {
                    combined.add(sum);
                }
            }
        }
        
        return combined;
    }

    private List<Integer> getIntegerList(int num, int bound) {
        if (num <= 0) return new ArrayList<>();
        ArrayList<Integer> list =new ArrayList<>();
        if (num == 1) list.add(1);
        else {
            int sum = 0;
            int i = 0;
            while (sum < bound) {
                sum = (int) Math.pow(num, i);
                i++;
                list.add(sum);
            }
        }
        return list;
    }
}