class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[n + m];
        
        while (i != m && j != n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while (i != m) {
            res[k] = nums1[i];
            i++;
            k++;
        }

        while (j != n) {
            res[k] = nums2[j];
            j++;
            k++;
        }

        for (int a = 0; a < res.length; a++) {
            nums1[a] = res[a];
        }
        
        for (int a = 0; a < res.length; a++) {
            System.out.print(res[a] + " ");
        }
        System.out.println();
    }
}
