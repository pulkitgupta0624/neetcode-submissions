class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];

            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }

            String key = Arrays.toString(freq);
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);
        }

        return new ArrayList<>(mp.values());
    }

    public boolean isAnagram(String s, String t){

        int[] freq = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            freq[ch-'a']--;
        }

        for(int x : freq) {
            if(x != 0){
                return false;
            }
        }

        return true;
    }
}
