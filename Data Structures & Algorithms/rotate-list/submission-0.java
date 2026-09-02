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
        if (head == null) return null;
        ListNode tail=head;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            if(temp!=null){
                tail=temp;
            }
            n++;
        }
        tail.next=head;
        k=k%n;
        ListNode newTail=tail;
        for(int i=0;i<n-k;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;

    }
}