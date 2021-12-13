public class MaxProductOfWordLength {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println( maxProduct(words));
    }

    public static int maxProduct (String[] words) {
        int len = words.length;
        int[] state = new int[len];

        for (int i = 0; i < len; i++) {
            state[i] = getStateFromString(words[i]);
        }

        int maxProduct = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((state[i] & state[j]) == 0) {
                    if (words[i].length() * words[j].length() > maxProduct) {
                        maxProduct = words[i].length() * words[j].length();
                    }
                }
            }
        }
        return maxProduct;
    }

    private static int getStateFromString(String str) {
        int state = 0;
        for (char c: str.toCharArray()) {
            int index = c - 'a';
            state |= 1 << (index);
        }
        return state;
    }
}
