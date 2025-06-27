class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for(int i=0;i<piles.length;i++){
            high = Math.max(piles[i],high);
        }
        while(low < high){
            int mid = (low + high) / 2;
            int ttlhrs = func(piles,mid);
            if(ttlhrs <= h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int func(int[] arr, int hourly){
        int ttl = 0;
        for(int i=0;i<arr.length;i++){
            ttl += (int)Math.ceil((double)arr[i]/hourly);
        }
        return ttl;
    }
}