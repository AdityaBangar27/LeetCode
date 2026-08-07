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
        //finding the size of the list
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
            return head;
        }

        int idx = 1;
        ListNode prev = head;
        while(idx < size-n){
            prev = prev.next;
            idx++;
        }

        prev.next = prev.next.next;
        return head;
    }
}