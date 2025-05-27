class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0, r = 0;
        int maxf = 0;
        int maxlen = 0;
        int[] hash = new int[26];

        while (r < n) {
            hash[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, hash[s.charAt(r) - 'A']); 

            if ((r - l + 1) - maxf > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1); 
            r++;
        }
        return maxlen;
    }
}
