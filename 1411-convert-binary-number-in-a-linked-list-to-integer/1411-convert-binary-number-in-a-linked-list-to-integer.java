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
    public int getDecimalValue(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int deci=0;
        temp=head;
        while(temp!=null){
            deci+=temp.val * (int)Math.pow(2,n-1);
            temp=temp.next;
            n--;
        }
        return deci;
    }
}