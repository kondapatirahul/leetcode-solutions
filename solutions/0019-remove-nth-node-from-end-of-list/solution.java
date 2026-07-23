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
        //if(head==null || head.next==null) return null;
        ListNode dummy=new ListNode(0,head);
        ListNode current=dummy;
        ListNode prev=dummy;
        for(int i=0;i<=n;i++)
        {
            current=current.next;
        }
       // if(current==null) return head.next;
        while(current!=null)
        {
            current=current.next;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return dummy.next;

    }
}
