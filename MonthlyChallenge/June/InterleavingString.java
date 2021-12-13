import java.util.Arrays;

public class InterleavingString {
    public static void main(String[] args) {
        Solution45 solution = new Solution45();
        boolean x = solution.isInterleave("aabcc", "dbbca", "aadbbcbcac");
        System.out.println(x);
    }
}

class Solution45 {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        for (char c : s3.toCharArray()) {
            if (first.length != 0 && first[0] == c) {
                first = Arrays.copyOfRange(first, 1, first.length);
            } else if (second.length != 0 && second[0] == c) {
                second = Arrays.copyOfRange(second, 1, second.length);
            } else {
                return false;
            }
        }
        return true;
    }
}