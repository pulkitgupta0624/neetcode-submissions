class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(int ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int ch : t.toCharArray()){
            freq[ch - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                return false;
            }
        }

        return true;
    }
}
