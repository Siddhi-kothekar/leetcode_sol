class Solution {
    public int jump(int[] nums) {
        int i = 0; 
        int cnt = 0; 
        int n = nums.length;

        while (i < n - 1) { 
            int maxReach = i + nums[i];
            if (maxReach >= n - 1) { 
                cnt++;
                break;
            }
            int nextIndex = i;
            for (int j = i + 1; j <= maxReach; j++) {
                if (j + nums[j] > nextIndex + nums[nextIndex]) {
                    nextIndex = j;
                }
            }

            if (nextIndex == i) { 
                return -1;
            }

            i = nextIndex;
            cnt++; 
        }

        return cnt; 
    }
}
