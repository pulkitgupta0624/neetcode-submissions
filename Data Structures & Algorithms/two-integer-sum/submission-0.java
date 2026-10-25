class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(mp.containsKey(rem)){
                ans[0] = i;
                ans[1] = mp.get(rem);
                break;
            }

            mp.put(nums[i], i);
        }
        
        Arrays.sort(ans);
        return ans;
    }
}
