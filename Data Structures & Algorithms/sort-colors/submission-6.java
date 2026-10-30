class Solution {
    public void sortColors(int[] nums) {
        int x = 0;
        int y = 0;
        int z = nums.length - 1;
        
        

        while(y <= z){

            if(nums[y] == 0){
                int temp = nums[y];
                nums[y] = nums[x];
                nums[x] = temp;
                x++;
                y++;
            } else if(nums[y] == 1){
                y++;
            } else {
                int temp = nums[y];
                nums[y] = nums[z];
                nums[z] = temp;
                z--;
            }
        }
    }
}