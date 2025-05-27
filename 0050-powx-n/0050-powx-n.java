class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1; 
        }

        if (n == Integer.MIN_VALUE) { 
            
            x = 1 / x;
            return myPow(x, Integer.MAX_VALUE) * x; 
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double half = myPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;  
        } else {
            return half * half * x;  
        }
    }
}
