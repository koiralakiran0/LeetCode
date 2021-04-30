public class PowerOfThree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(243));
    }

    
}

class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0; //1162261467 is the max integer that is the power of 3. Only works if it is power of prime number
    }
}
