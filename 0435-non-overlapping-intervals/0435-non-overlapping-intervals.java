class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt = 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int i=0;
        int j=1;
        while(j<intervals.length && i<intervals.length){
            if(intervals[j][0] < intervals[i][1]){
                cnt++;
                j++;
            }
            else{
                i=j;
                j++;
            }
        }
        return cnt;
    }
}