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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry =0;
        ListNode result=new ListNode(0);
        ListNode tail=result;
        while(temp1 != null || temp2 != null || carry != 0){
            int digit1 =0;
            int digit2=0;
            if(temp1!=null){
                digit1=temp1.val;
            }
            if(temp2!=null){
                digit2=temp2.val;
            }
            int sum=digit1+digit2+carry;
            int digit=sum%10;
            carry=sum/10;
            tail.next=new ListNode(digit);
            tail=tail.next;
            if(temp1!=null){
                temp1=temp1.next;
            }
            if(temp2!=null){
                temp2=temp2.next;
            }
            
        }
        return result.next;
    }
}
