
public class AddTwoNumbersSolution {
    public static void main(String[] args) {
        ListNode root1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode root2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode ans = addTwoNumbers(root1, root2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rootNode = new ListNode();
        add(rootNode, l1, l2, 0);
        return rootNode;
    }
    
    private static void add(ListNode current, ListNode l1, ListNode l2, int reminder) {
        if (l1 == null && l2 == null) {
            if (reminder > 0) current = new ListNode(reminder);
        } else if (l1 == null) {
            int sum = l2.val + reminder;
            current = sum%10;
            current.next = new ListNode();
            add(current.next, null, l2.next, sum/10);
        } else if (l2 == null) {
            int sum = l1.val + reminder;
            current = sum%10;
            current.next = new ListNode();
            add(current.next, l1.next, null, sum/10);
        } else {
            int sum = l1.val + l2.val + reminder;
            current = sum%10;
            current.next = new ListNode();
            add(current.next, l1.next, l2.next, sum/10);
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}