class Solution {
    List<List<Integer>> ans;
   public void helper(int[] nums, List<Integer> sub) {
        if (sub.size() == nums.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sub.contains(nums[i])) continue;
            sub.add(nums[i]);
            helper(nums, sub);
            sub.remove(sub.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        helper(nums, new ArrayList<>());
        return ans;
    }

}