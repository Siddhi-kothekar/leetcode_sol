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
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        if(cnt == n){
            return head.next;
        }
        int k = (cnt - n);
        ListNode q = head;
        for(int i=1;i<k;i++){
            q = q.next;
        }
        ListNode tobedeleted = q.next;
        q.next = tobedeleted.next;

        return head;

    }
}