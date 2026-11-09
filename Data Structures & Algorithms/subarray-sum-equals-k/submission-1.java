class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int ans = 0;

        // for(int i=0; i<n; i++){
        //     int sum = 0;

        //     for(int j=i; j<n; j++){
        //         sum += nums[j];

        //         if(sum == k){
        //             ans++;
        //         }
        //     }
        // }

        // return ans;

        int count = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        int currSum = 0;

        for(int num : nums){
            currSum += num;

            if(currSum == k){
                count++;
            }

            if(mp.containsKey(currSum-k)){
                count += mp.get(currSum-k);
            }

            mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}