class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String s:strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append('#');
                sb.append(i);
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}