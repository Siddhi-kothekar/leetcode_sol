class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff=0;
        if(nums[0] != 0) return 0;
        if(nums[n-1] != n) return n;
        for(int i=1;i<nums.length;i++){
            diff = nums[i]-nums[i-1];
            if(diff>1){
                return nums[i] - 1;
            }
        }
        return 0;
    }
}