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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s= new HashSet<>();
        for(int n:nums) s.add(n);
        ListNode node = new ListNode();
        node.next=head;
        ListNode c=head , p=node;
        while(c !=null){
            ListNode nxt=c.next;
            if(s.contains(c.val)){
                p.next=nxt;
            }else{
                p=c;
            }
            c=c.next;
        }
        return node.next;

    }
}