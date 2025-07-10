class Solution {
    public String sortVowels(String s) {
       int n = s.length();
       StringBuilder t = new StringBuilder();
       StringBuilder vowels = new StringBuilder();
       for(int i=0;i<n;i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' ){
            vowels.append(s.charAt(i));
        }
       }
       char[] chars = vowels.toString().toCharArray();
       Arrays.sort(chars);
       int j=0;
       for(int i=0;i<n;i++){
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' ){
            t.append(chars[j]);
            j++;
        }
        else{
            t.append(s.charAt(i));
        }
       } 
       return t.toString();
    }
}