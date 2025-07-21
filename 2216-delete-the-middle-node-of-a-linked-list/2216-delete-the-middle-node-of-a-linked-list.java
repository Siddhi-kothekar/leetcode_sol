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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        if(head.next == null) return null;
        int cnt =0;
        while(temp!=null){
            cnt++;
            temp= temp.next;
        }
        //int nodes = cnt-1;
        int midnode = cnt/2;
        temp = head;
        for(int i=0;i<midnode-1;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}