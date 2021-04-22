import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        /*
        
        */
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.setNext(node2);
        // ListNode node3 = new ListNode(5);
        // node2.setNext(node3);
        // ListNode node4 = new ListNode(2);
        // node3.setNext(node4);
        // ListNode node5 = new ListNode(1);
        // node4.setNext(node5);
        node2.setNext(null);

        System.out.println(isPalindrome2(node));
    }
    public static boolean isPalindrome(ListNode head) {
        int size = findSize(head);
        ListNode current = head;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size/2; i++) {
            stack.push(current.getVal());
            current = current.getNext();
        }

        if (size % 2 == 1) {
            current = current.getNext();
        }
        while (current != null) {
            if (current.getVal() != stack.pop()) {
                return false;
            }
            current = current.getNext();
        }
        return true;
    }
    private static int findSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.getNext();
        }
        return size;
    }

    public static boolean isPalindrome2(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.getVal());
            head = head.getNext();
        }

        return builder.toString().equals(builder.reverse().toString());
    }
}
