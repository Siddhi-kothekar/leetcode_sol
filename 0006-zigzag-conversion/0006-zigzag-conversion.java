class Solution {     
    public String convert(String s, int numRows) {         
        if (numRows == 1 || s.length() <= numRows) {  
            return s;  
        }

        StringBuilder ans = new StringBuilder();  
        int gap = 2 * numRows - 2;  

        for (int i = 0; i < numRows; i++) {  
            for (int j = i; j < s.length(); j += gap) {  
                ans.append(s.charAt(j));  

                int secondIndex = j + gap - 2 * i;  
                if (i != 0 && i != numRows - 1 && secondIndex < s.length()) {  
                    ans.append(s.charAt(secondIndex));  
                }
            }  
        }  
        return ans.toString();  
    }  
}
