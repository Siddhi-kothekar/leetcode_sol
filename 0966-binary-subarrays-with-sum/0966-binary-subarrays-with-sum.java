class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal -1);
    }
    public int atMost(int[] nums, int goal) {
        int l=0;
        int r=0;
        int sum = 0;
        int cnt =0;
        while(r<nums.length){
            if(goal<0) return 0;
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            cnt += (r-l)+1;
            r++;
        }
        return cnt;
    }
}