class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = strs[0].length();
        String first = strs[0];

        for(String s : strs) {
            minLen = Math.min(minLen, s.length());
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<minLen; i++) {

            char ch = first.charAt(i);

            for(String s : strs){
                if(ch != s.charAt(i)){
                    return ans.toString();
                }
            }

            ans.append(ch);
        }

        return ans.toString();
    }
}