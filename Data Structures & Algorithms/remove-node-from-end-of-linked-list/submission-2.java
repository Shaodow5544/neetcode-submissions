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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0) return head;
        if(head.next==null) return null;
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        count=count-n;
        if(count==0) return head.next;
        curr=head;
        while(count>1)
        {
            count--;
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
