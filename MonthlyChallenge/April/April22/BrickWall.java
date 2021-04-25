package April22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BrickWall {
    public static void main(String[] args) {
        List<List<Integer>> wall = Arrays.asList(
            Arrays.asList(1,1),
            Arrays.asList(2),
            Arrays.asList(1,1)
            //Arrays.asList(2,4),
           // Arrays.asList(3,1,2),
           // Arrays.asList(1,3,1,1)
        );

        System.out.println(leastBricks(wall));
    }

    public static int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> gapsMap = new HashMap<>();
        int cumSum = 0;
        int maxVal = 0;

        for (List<Integer> list : wall) {
            cumSum = 0;
            for (int i = 0; i < list.size()-1; i++) {
                cumSum += list.get(i);
                gapsMap.put(cumSum, gapsMap.getOrDefault(cumSum,0) + 1);
                maxVal = Math.max(maxVal, gapsMap.get(cumSum));
            }
        }
        return wall.size() - maxVal;
    }
    
}
