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
    public boolean isPalindrome(ListNode head) {
        if(head==null )
            return false;
        else if(head.next==null)
            return true;
        ListNode first=head;
        ListNode temp=middleNode(head);
        ListNode hlp=temp.next;
        temp.next=null;
        ListNode temp1=reverseList(hlp);   
        while(temp1!= null){
            if(temp1.val!=first.val){
                // reverse wali linked list ko pehli wali linked lsit ke sath check kr rhe hai
                return false;
            }
            first=first.next;
            temp1=temp1.next;
            
        }
        return true;
    }
        public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
           ListNode ahead=cur.next;
            cur.next=prev;
            prev=cur;
            cur=ahead;
        }
        return prev;
    }
         public ListNode middleNode(ListNode head) {
         ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
    // jab 2 middle nodes hai and hume 1st middle node return krna hai (y uska code hai)
        }
        return slow;
    }
}