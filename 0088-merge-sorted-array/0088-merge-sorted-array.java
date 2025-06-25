class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[n+m];
        int p=0;
        int q=0;
        int k=0;
        while(p<m && q<n){
            if(nums1[p] <= nums2[q]){
                arr[k] = nums1[p];
                p++;
            }
            else{
                arr[k] = nums2[q];
                q++;
            }
            k++;
        }
        if(p!=m){
            while(p<m){
                arr[k] = nums1[p];
                p++;
                k++;
            }
        }
        if(q!=n){
            while(q<n){
                arr[k] = nums2[q];
                q++;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            nums1[i] = arr[i];
        }
    }
}