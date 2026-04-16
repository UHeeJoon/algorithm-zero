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
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode reverse = new ListNode();
        while(head != null) {
            reverse.val = head.val;
            if (head.next != null) {
                reverse = new ListNode(0, reverse);
            }
            head = head.next;
        }
        return reverse;
    }
}
