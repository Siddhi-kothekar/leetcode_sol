class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> hs = new HashMap<>();
        //HashMap<Character,Integer> ht = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            hs.put(sc,hs.getOrDefault(sc,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!hs.containsKey(ch) || hs.get(ch)==0){
                return false;
            }
            hs.put(ch,hs.get(ch)-1);
        }
        return true;
    }
}