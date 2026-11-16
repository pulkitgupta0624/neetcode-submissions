class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currMin = prices[0];

        int n = prices.length;

        for(int i=1; i<n; i++){
            currMin = Math.min(currMin, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - currMin);
        }

        return maxProfit;
    }
}
