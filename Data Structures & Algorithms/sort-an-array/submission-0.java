class Solution {
    public int[] sortArray(int[] nums) {

        merge(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0; i<n1; i++){
            arr1[i] = nums[l+i];
        }
        for(int i=0; i<n2; i++){
            arr2[i] = nums[m+i+1];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                nums[k++] = arr1[i++];
            }else{
                nums[k++] = arr2[j++];
            }
        }

        while(i < n1){
            nums[k++] = arr1[i++];
        }

        while(j < n2){
            nums[k++] = arr2[j++];
        }

    }

    public void merge(int[] nums, int l, int r){
        if(l<r){
            int m = l + (r-l)/2;

            merge(nums, l, m);
            merge(nums, m+1, r);

            mergeSort(nums, l, m, r);
        }
    }
}