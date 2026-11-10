class Solution {
    public int missingNumber(int[] nums) {
        int miss = 0;

        for(int i=1; i<=nums.length; i++){
            miss ^= (nums[i-1]^i);
        }

        return miss;
    }
}
