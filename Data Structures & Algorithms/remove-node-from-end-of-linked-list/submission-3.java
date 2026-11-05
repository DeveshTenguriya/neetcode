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

        if(head==null ){
            return head;
        }

        ListNode current= head;

        int size=0;

        while(current!=null){
            current= current.next;
            size++;
        }

        if(size==n){
            return head.next;
        }

        current= head;

        int count=1;

        while(count<(size-n)){
            current=current.next;
            count++;
        }

        current.next=current.next.next;

        return head;
    }
}
