class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j = heights.length-1;

        int ans = 0;

        while(i < j){
            int area = 0;
            if(heights[i] < heights[j]){
                int l = j-i;
                area = heights[i]*l;
                i++;
            } else {
                int l = j-i;
                area = heights[j]*l;
                j--;
            }

            ans = Math.max(ans, area);
        }

        return ans;
    }
}
