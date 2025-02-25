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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null,ptr = null;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = (l1!=null?l1.val:0)+(l2!=null?l2.val:0)+carry;
            carry = sum/10;
            if(l3 == null)
                l3 = ptr = new ListNode(sum%10);
            else{
                ptr.next = new ListNode(sum%10);
                ptr = ptr.next;
            }
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry!=0){
           ptr.next = new ListNode(carry);
        }
        return l3;
    }
}