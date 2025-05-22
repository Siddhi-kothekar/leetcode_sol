class Solution {
    public int maxSubArray(int[] nums) {
        int sum, max;
        sum = max = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]+sum>=nums[i]){
                sum = nums[i] + sum;
            }else{
                sum=nums[i];
            }

            if(sum>max){
                max= sum;
            }
        }

        if(sum>max)
            return sum;
        return max;
    }
}