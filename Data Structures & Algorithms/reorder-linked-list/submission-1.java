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
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode l1=head;
        ListNode l2=reverse(slow.next);
        slow.next=null;
        //0 1 2 3 
        //6 5 4 
        ListNode temp1=l1;
        ListNode temp2=l2;

         // Merge
        while(l2 != null)
        {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;

            l1.next = l2;
            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }
        return ;

    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}
