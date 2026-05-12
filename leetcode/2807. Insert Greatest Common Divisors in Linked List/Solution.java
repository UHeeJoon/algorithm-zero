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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        insertDivisor(head);
        return head;
    }

    public void insertDivisor(ListNode head) {
        if (head.next == null) {
            return;
        }
        ListNode now = head;
        ListNode next = head.next;
        ListNode gcd = new ListNode(getGCD(now.val, next.val), next);
        now.next = gcd;
        insertDivisor(next);
    }

    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
