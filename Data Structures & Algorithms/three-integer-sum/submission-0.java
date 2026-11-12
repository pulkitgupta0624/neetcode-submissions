class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        
        Arrays.sort(nums);

        Set<List<Integer>> ans = new HashSet<>();

        for(int idx = 0; idx<nums.length-2; idx++){

            int target = -nums[idx];

            int i = idx+1;
            int j = n-1;

            while(i < j){
                int curr = nums[i] + nums[j];
                // if(nums[i] == nums[j] ) continue;
                if(curr == target){
                    List<Integer> temp = new ArrayList<>();
                    temp = Arrays.asList(nums[idx], nums[i], nums[j]);
                    ans.add(temp);
                    i++;
                   
                } else if(curr < target){
                    i++;
                } else {
                    j--;
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
