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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode temp=head;
        int c=0;// c means length of linked list
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        k=k%c;
         for(int i=0 ; i<k ; i++){
            ListNode dummy = head;
            ListNode prev=null;
            while(dummy.next!=null){
                prev = dummy;
                dummy = dummy.next;
            }
            if(prev!=null){
                prev.next = null;
                dummy.next = head;
                head = dummy;

            }
        }
        return head;
        
    }    
}