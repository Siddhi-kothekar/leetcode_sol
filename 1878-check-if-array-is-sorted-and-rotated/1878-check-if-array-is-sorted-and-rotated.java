class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        int pos = 1;

        while(pos < n && nums[pos] >= nums[pos - 1]) {
            pos++;
        }

        if(pos == n) return true;


        if(pos == n - 1) return nums[pos] <= nums[0]; 

        pos++;

        while(pos < n && nums[pos] >= nums[pos - 1]) {
            pos++;
        }

        return pos == n && nums[n - 1] <= nums[0];
    }
}
