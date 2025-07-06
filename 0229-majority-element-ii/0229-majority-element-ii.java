class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            if (mpp.get(nums[i]) == (n / 3) + 1) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}
