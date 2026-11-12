class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;

        for(int i=0; i<nums.length; i++){
            if(idx == 0 || nums[i] != nums[idx-1]){
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}