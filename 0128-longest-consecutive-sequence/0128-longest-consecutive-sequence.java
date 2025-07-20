class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int longest = 1;
        int cnt = 0;
        int last = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] -1 == last){
                cnt++;
                last = nums[i];
            }
            else if(nums[i] != last){
                cnt = 1;
                last = nums[i];
            }
            
                longest = Math.max(longest,cnt);
            
        }
        return longest;
    }
}