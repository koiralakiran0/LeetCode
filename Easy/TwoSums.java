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
        //<Complement, Index>
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(nums[i])) {
                return new int[] {hashtable.get(nums[i]), i};
            }
            hashtable.put(target - nums[i], i);
        }
        return new int[] {-1, -1};
    }
}