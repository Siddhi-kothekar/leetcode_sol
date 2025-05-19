class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int cnt =0;
        int max_cnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                cnt++;
            }
            else{
                cnt =0;
            }
            max_cnt = Math.max(max_cnt,cnt);
        }
        return max_cnt;
    }
}