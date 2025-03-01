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
    public ListNode rotateRight(ListNode head, int k) {
        // Edge case: If the list is empty or has only one node, return as is
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the linked list
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Optimize k
        k = k % length;
        if (k == 0) return head; // No rotation needed

        // Step 3: Find the new tail (length-k-1th node) and new head (length-kth node)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 4: Perform the rotation
        ListNode newHead = newTail.next; // New head is the next node
        newTail.next = null; // Break the link to create a new tail
        temp.next = head; // Connect the old tail to the original head

        return newHead; // Return the new head after rotation
    }
}
