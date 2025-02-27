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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = null,ptr3 = null;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                if(merge == null)
                    merge = ptr3 = new ListNode(list1.val,null);
                else
                    ptr3 = ptr3.next = new ListNode(list1.val,null);
                list1 = list1.next;
            }
            else{
                if(merge == null)
                    merge = ptr3 = new ListNode(list2.val,null);
                else
                    ptr3 = ptr3.next = new ListNode(list2.val,null);
                list2 = list2.next;
            }
        }
        if(list1!=null && ptr3!= null){
            ptr3.next = list1;
        }
        if(list2!=null && ptr3!= null){
            ptr3.next = list2;
        }
        return merge;
    }
}