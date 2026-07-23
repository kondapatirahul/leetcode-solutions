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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0,head);
      ListNode slow=dummy;
      while(slow.next!=null)
      {
        if(slow.next.val==val)
        {
            slow.next=slow.next.next;
        }
        else{
            slow=slow.next;
        }
      }  
      return dummy.next;
    }
}
