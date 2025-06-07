/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode,Integer> mpp = new HashMap<>();
        ListNode temp = head;
        int ind = 0;
        while(temp!=null){

            if(mpp.containsKey(temp)){
                System.out.println("tail connects to node index "+ ind);
                break;
            }
            ind++;
            mpp.put(temp,ind);
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("no cycle");
        }
        
        return temp;
    }
}