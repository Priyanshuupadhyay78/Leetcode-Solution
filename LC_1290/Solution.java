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
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        if(head.next==null) return head.val;
        int decimal=0;
        ListNode curr=head;
        decimal=curr.val*2;
        curr=curr.next;
        while(curr.next!=null){
            decimal*=2;
            decimal+=curr.val*2;
            curr=curr.next;
        }
        decimal+=curr.val*1;
        return decimal;
    }
}