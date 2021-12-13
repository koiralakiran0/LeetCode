public class StringManipulation {
    public static void main(String[] args) {
        String s = reverseString("yesss");
        System.out.println(s);
    }

    private static String reverseString(String string) {
        char[] str = string.toCharArray();
        int length = str.length;
        for (int i = 0; i < length/2; i++) {
            //swap the ith element with str at length-1-i
            char temp = str[i];
            str[i] = str[length-1-i];
            str[length-1-i] = temp;
        }
        return new String(str);
    }
}
