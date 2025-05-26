class Solution {
    
    public void helper(int n, int open , int close, String str,List<String> ans){
        if(open==close && open+close==n*2){
            ans.add(str);
            return ;
        }
        if(open<n){
            helper(n,open+1,close,str + "(",ans);
        }
        if(close<open){
            helper(n,open,close+1,str + ")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        helper(n,0,0,"",ans);
        return ans;
    }
}