class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       // HashMap<Character,Integer> rn = new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(!m.containsKey(ch) || m.get(ch)==0){
                return false;
            }
            m.put(ch,m.get(ch)-1);
        }
        return true;
    }
}