class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String firstWord = strs[0];

        for (int i = 0; i < firstWord.length(); i++) {
            String prefix = firstWord.substring(0, i + 1);

            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) { 
                    return firstWord.substring(0, i); 
                }
            }
        }

        return firstWord; 
    }
}
