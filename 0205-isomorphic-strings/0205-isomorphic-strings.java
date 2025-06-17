class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hs.containsKey(s.charAt(i))){
                hs.put(s.charAt(i),i);
            }
            if(!ht.containsKey(t.charAt(i))){
                ht.put(t.charAt(i),i);
            }
            if(!hs.get(s.charAt(i)).equals(ht.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}