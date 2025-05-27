class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private void findCombination(int i,int[] arr,int target,List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int ind = i;ind<arr.length ;ind++){
            if(ind>i && arr[ind]==arr[ind-1]) continue;
            if(arr[ind]>target) break;

            ds.add(arr[ind]);
            findCombination(ind+1,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}