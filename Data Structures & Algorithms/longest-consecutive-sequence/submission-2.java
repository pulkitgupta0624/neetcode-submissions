class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int num : nums){
            st.add(num);
        }

        int ans = 0;

        for(int num : st){
            
            if(!st.contains(num-1)){
                int length = 1;
                while(st.contains(num + length)){
                    length++;
                }

                ans = Math.max(ans, length);
            }
           
        }

        return ans;
    }
}
