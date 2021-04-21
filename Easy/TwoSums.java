package Easy;

import java.util.Hashtable;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums, 9);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.contains(target - nums[i])) {
                return new int[] {i, target - i};
            }
            hashtable.put(i, target - nums[i]);
        }
        return new int[] {-1, -1};
    }
}