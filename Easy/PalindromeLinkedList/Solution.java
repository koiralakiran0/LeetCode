package PalindromeLinkedList;

import java.util.Stack;

public class Solution {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public boolean isPalindrome(ListNode head) {
        int size = findSize(head);
        ListNode current = head;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size/2; i++) {
            stack.push(current.val);
            current = current.next;
        }
        
        if (size % 2 == 1) {
            current = current.next;
        }

        while (current != null) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
    
    private int findSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
