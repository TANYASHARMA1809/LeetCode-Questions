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
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode l1=reverse(head1);
        ListNode l2=reverse(head2);
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        int c=0;
        while(l1!=null && l2!=null){
            int v=l1.val+l2.val+c;
            c=v/10;
            l3.next=new ListNode(v%10);
            l3=l3.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int v=l1.val+c;
            c=v/10;
            l3.next=new ListNode(v%10);
            l3=l3.next;
            l1=l1.next;

        }
        while(l2!=null){
            int v=l2.val+c;
            c=v/10;
            l3.next=new ListNode(v%10);
            l3=l3.next;
            l2=l2.next;

        }
        if(c>0){
            l3.next=new ListNode(c);
        }
        ListNode l4=reverse(head.next);
        return l4;
        
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}