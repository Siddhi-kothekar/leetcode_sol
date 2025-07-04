class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0] <= target && target <= matrix[i][n-1]){
                return bs(matrix[i] , target);
            }
        }
        return false;
    }
    public boolean bs(int[] mat, int target){
        int l = 0;
        int h = mat.length - 1;
        while(l<=h){
            int mid = (l+h)/2;
            if(target == mat[mid]) return true;
            if(target < mat[mid]){
                h =mid -1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}