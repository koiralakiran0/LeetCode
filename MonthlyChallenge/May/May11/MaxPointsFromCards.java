import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxPointsFromCards {
    public static void main(String[] args) {
        SolutionMaxPointsFromCards s = new SolutionMaxPointsFromCards();
        
        int[] cardPoints = {100,40,17,9,73,75};
        int k = 3;

        int sum = 0;
        int start = 0;
        int end = cardPoints.length-1;
        for (int i = 0; i < k; i++) {
            if (cardPoints[start] > cardPoints[end]) {
                sum+=cardPoints[start];
                start++;
            } else {
                sum+=cardPoints[end];
                end--;
            }
        }
        System.out.println(sum);

        /**
         * Different Approach
         */
        ArrayList<Integer> list = new ArrayList<>();
        int length = cardPoints.length;
        for (int i = 0; i < length; i ++) {
            list.add(i);
        }

        System.out.println(s.maxScore(cardPoints, k));
    }
}

//Originally thought it was either the first k element or the second
class SolutionMaxPointsFromCards {
    public int maxScore(int[] cardPoints, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = k;
        for (int i = 0; i < cardPoints.length-k; i++) {
            list.add(getSum(Arrays.copyOfRange(cardPoints, start, end)));
            start++;
            end++;
        }
        return Collections.max(list);
    }
    
    private int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
}