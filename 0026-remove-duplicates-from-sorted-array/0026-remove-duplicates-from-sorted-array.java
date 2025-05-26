class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int k=1;
        int n = nums.length;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[k]=nums[j];
                i=j;
                j++;
                k++;
            }
        }
        return k;
    }
}