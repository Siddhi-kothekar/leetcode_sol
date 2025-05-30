class Solution {
    public boolean canJump(int[] nums) {
        int m = nums.length;
        int maxp=0;
        for(int i=0;i<m;i++){
            if(i>maxp) return false;
            maxp = Math.max(i+nums[i],maxp);
            if(maxp>=m-1) return true;
        }

        return true;
    }
}