class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(num1 == num){
                count1++;
            } else if(num2 == num){
                count2++;
            } else if(count1 == 0){
                num1 = num;
                count1 = 1;
            } else if(count2 == 0){
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        } 

        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num == num1){
                count1++;
            } else if(num == num2){
                count2++;
            }
        }

        if(count1 > (nums.length)/3) ans.add(num1);

        if(count2 > (nums.length)/3) ans.add(num2);

        return ans;


    }
}