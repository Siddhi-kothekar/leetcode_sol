class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        StringBuilder str = new StringBuilder();
        int org = x;
        int rev = 0;
        while(x!=0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        
        if(rev==org){
            return true;
        }
        return false;
    }
}