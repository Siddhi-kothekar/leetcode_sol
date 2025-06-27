class Solution {
    public double myPow(double x, int n) {
        if(n == Integer.MIN_VALUE){
            x = 1/x;
            return myPow(x,Integer.MAX_VALUE) * x;
        }
        if(n<0){
            x = 1/x;
            n = -n;
        }
        double res = 1;
        double cp = x;
        while(n>0){
            if(n % 2 == 1){
                res = res * cp;
            }
            cp = cp * cp;
            n = n/2;
        }
        return res;
    }
}