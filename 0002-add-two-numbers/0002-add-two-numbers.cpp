class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* lnew = new ListNode(); // This will be our dummy head
        ListNode* current = lnew; // Pointer to construct the new list
        int sum = 0; // This will store the current sum and carry

        while (l1 != nullptr || l2 != nullptr) {
            sum += (l1 != nullptr) ? l1->val : 0;
            sum += (l2 != nullptr) ? l2->val : 0;

            // Add the sum to the new list
            current->next = new ListNode(sum % 10);
            current = current->next;

            // Calculate carry
            sum /= 10;

            // Move to the next nodes if they are not null
            if (l1 != nullptr) l1 = l1->next;
            if (l2 != nullptr) l2 = l2->next;
        }
        if (sum > 0) {
            current->next = new ListNode(sum);
        }
        return lnew->next;
    }
};
