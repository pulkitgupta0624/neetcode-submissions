class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        int n = nums.length;

        for(int i=0; i<n; i++){

            int curr = nums[i];
            
            if(mp.containsKey(curr)){
                int idx = mp.get(curr);

                if(i - idx <= k){
                    return true;
                }
            }

            mp.put(curr, i);
        }

        return false;
        
    }
}