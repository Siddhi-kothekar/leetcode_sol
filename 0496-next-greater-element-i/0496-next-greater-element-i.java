import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int current = nums1[i];
            int j = 0;

            
            while (j < m && nums2[j] != current) {
                j++;
            }
            int k = j + 1;
            while (k < m && nums2[k] <= current) {
                k++;
            }

            if (k == m) {
                ans[i] = -1;
            } else {
                ans[i] = nums2[k];
            }
        }

        return ans;
    }
}
