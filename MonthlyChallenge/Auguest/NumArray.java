class NumArray {
    private final int[] nums;
    
    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) return nums[right];
        return nums[right] - nums[left-1];
    }
}

class NumArrayMain {
    public static void main(String[] args) {
        //[[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]
        int[] arr = {-2,0,3,-5,2,-1};
        NumArray numArray = new NumArray(arr);

        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}