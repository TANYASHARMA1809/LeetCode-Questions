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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode cur=head;
        ListNode prev=null;
        ListNode ahead=null;
        int count=0;
        while(cur!=null && count<2){
            // prev and ahead ki swapping krenge by taking 3rd pointer previous
            ahead=cur.next;
            cur.next=prev;
            prev=cur;
            cur=ahead;
            count++;
        }
        if(ahead!=null && size(ahead)>=2)
            head.next=swapPairs(ahead);
        else
            head.next=ahead;
        return prev;
    }
    public int size(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
}