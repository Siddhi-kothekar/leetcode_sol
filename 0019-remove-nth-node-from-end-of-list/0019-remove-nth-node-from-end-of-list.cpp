/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        // Step 1: Calculate the length of the linked list
        ListNode* p = head;
        int cnt = 0;
        while(p != NULL) {
            p = p->next;
            cnt++;
        }

        // Step 2: Calculate the position to remove from the start
        int k = cnt - n;

        // Edge case: if we need to remove the head
        if (k == 0) {
            ListNode* newHead = head->next;
            delete head; // Free the memory of the old head
            return newHead;
        }

        // Step 3: Iterate to the node just before the one to be removed
        ListNode* q = head;
        for(int i = 1; i < k; i++) {
            q = q->next;
        }

        // Step 4: Remove the nth node from the end
        ListNode* nodeToRemove = q->next;
        q->next = nodeToRemove->next;
        delete nodeToRemove; // Free the memory of the removed node

        // Return the head of the modified list
        return head;
    }
};
