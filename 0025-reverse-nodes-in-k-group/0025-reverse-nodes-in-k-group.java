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
    public ListNode reverseKGroup(ListNode head, int k) {
        //  this  que is same as que 24 (swap nodes)
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        // k elements ko  reverse krenge 
        ListNode cur=head;
        ListNode prev=null;
        ListNode ahead=null;
        int count=0;
        while(cur!=null && count<k){
            ahead=cur.next;
            cur.next=prev;
            prev=cur;
            cur=ahead;
            count++;
        }

        // ahead is not equal to null means ll m abhi aur elements hai size function se ll ka size find krenge and if ll ka size k ke equal ya k se greater hai to recursive call lagayenge (recursion se kahenge aage ke k elements ko reverse krde ll m )
        if(ahead!=null && size(ahead)>=k)
            head.next=reverseKGroup(ahead,k);
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