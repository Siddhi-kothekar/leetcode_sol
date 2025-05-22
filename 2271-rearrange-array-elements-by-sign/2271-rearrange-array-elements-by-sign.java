class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pi=0;
        int ni=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr[pi] = nums[i];
                pi += 2;
            }
            else{
                arr[ni]=nums[i];
                ni += 2;
            }
        }
        return arr;
    }
}