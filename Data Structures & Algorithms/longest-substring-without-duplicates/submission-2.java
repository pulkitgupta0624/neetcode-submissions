class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int l = 0;
        int r = 0;

        boolean[] freq = new boolean[128];

        int ans = 0;

        while(r < n){

            while(freq[s.charAt(r)] == true){
                freq[s.charAt(l)] = false;
                l++;
            }
            
            freq[s.charAt(r)] = true;
            ans = Math.max(ans, r-l+1);
            r++;
        }

        return ans;


    }
}
