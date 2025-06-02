class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=1;i<=numRows;i++){
            List<Integer> res = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    res.add(1);
                }
                else{
                    res.add(ans.get(i-2).get(j-1) + ans.get(i-2).get(j));
                }
            }
            ans.add(res);

        }
        return ans;
    }
}