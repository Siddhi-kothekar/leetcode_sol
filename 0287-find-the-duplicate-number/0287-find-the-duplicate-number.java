class Solution {
    public int findDuplicate(int[] nums) {
        int range = nums.length - 1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]] != 0){
                return nums[i];
            }
            else{
                arr[nums[i]]++;
            }
        }
        return 0;
    }
}