/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       while(node.next!=null&&node.next.next!=null){
        int value=node.next.val;
        node.val=value;
        node=node.next;
       } 
       node.val=node.next.val;
       node.next=null;
    }
}