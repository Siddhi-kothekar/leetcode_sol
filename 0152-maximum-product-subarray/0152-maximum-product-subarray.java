class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1;
        int suff = 1;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pre == 0) pre = 1;
            if(suff == 0) suff = 1;
            pre *= nums[i];
            suff *= nums[n-i-1];
            maxi = Math.max(maxi,Math.max(pre,suff));
        }
        return maxi;
    }
}