import java.util.ArrayList;

public class SplitArrays {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,2,5,0};
        Solution solution = new Solution();
        System.out.println(solution.waysToSplit(nums));
    }
}


class Solution {
    public int waysToSplit(int[] nums) {
        int firstSum, secondSum, thirdSum;
        firstSum = secondSum = thirdSum = 0;
        ArrayList<Integer> firstList, secondList, thirdList;
        firstList = new ArrayList<>();
        secondList = new ArrayList<>();
        thirdList = new ArrayList<>();
        
        if (nums.length < 3) return 0;

        return 1;
    }
}