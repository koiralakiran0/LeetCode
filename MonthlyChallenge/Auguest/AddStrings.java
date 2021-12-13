import java.util.HashMap;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println("fixing errors");
        
    }

    public int minDeletions(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (char c: s.toCharArray()) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        
        return hashmap.keySet().size();
    }

    public void sortStrings(String num1, String num2) {
        int reminder = 0;
        int len1 = num1.length();
        int len2 = num2.length();
        int len = Math.max(len1, len2);
        char[] res = new char[len];
        int sum = 0;
        
        for (int i = len-1; i >= 0; i--) {
            if (i < len1-1) sum += num1.charAt(i) - 47;
            if (i < len2-1) sum += num2.charAt(i) - 47;
            int lastDigit = sum%10;
            res[i] = (char) (lastDigit + 47);
            reminder = sum/10;
        }
        System.out.println(reminder);
    }
}