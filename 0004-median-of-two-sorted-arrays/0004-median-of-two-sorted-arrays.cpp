class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
        vector<int> merarr(m + n);
        int p = 0, q = 0, i = 0;
        
        while (p < m && q < n) {
            if (nums1[p] < nums2[q]) {
                merarr[i++] = nums1[p++];
            } else {
                merarr[i++] = nums2[q++];
            }
        }
        while (p < m) {
            merarr[i++] = nums1[p++];
        }
        while (q < n) {
            merarr[i++] = nums2[q++];
        }

        int totalSize = m + n;
        if (totalSize % 2 != 0) {
            return merarr[totalSize / 2];
        } else {
            int mid1 = totalSize / 2;
            int mid2 = mid1 - 1;
            return (merarr[mid1] + merarr[mid2]) / 2.0;
        }
    }
};
