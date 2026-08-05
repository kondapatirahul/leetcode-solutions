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
    public ListNode swapNodes(ListNode head, int k) {
        // ListNode dummy=ListNode(-1);
        // dummy.next=head;
        // ListNode prev=dummy;
        ListNode cur=head;
        ArrayList<Integer> ar=new ArrayList<>();
        while(cur!=null)
        {
            ar.add(cur.val);
            cur=cur.next;
        }
        int n=ar.size();
        int temp=ar.get(k-1);
        ar.set(k-1,ar.get(n-k));
        ar.set(n-k,temp);
        cur=head;
        for(int i=0;i<n;i++)
        {
            cur.val=ar.get(i);
            cur=cur.next;
        }
        return head;
    }
}
