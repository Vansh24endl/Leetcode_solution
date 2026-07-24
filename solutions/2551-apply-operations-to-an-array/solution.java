class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int Z = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] != 0){
                int temp = nums[Z];
                nums[Z] = nums[r];
                nums[r] = temp;
                Z++;
            }
        }
        return nums;
    }
}
